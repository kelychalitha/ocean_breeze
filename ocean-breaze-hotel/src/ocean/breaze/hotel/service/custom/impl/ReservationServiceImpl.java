/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.service.custom.impl;

import java.sql.Connection;
import ocean.breaze.hotel.dao.DaoFactory;
import ocean.breaze.hotel.dao.custom.ResDetailDao;
import ocean.breaze.hotel.dao.custom.ReservationDao;
import ocean.breaze.hotel.dao.custom.RoomDao;
import ocean.breaze.hotel.db.DBConnection;
import ocean.breaze.hotel.dto.ResDetailDto;
import ocean.breaze.hotel.dto.ReservationDto;
import ocean.breaze.hotel.entity.ResDetailEntity;
import ocean.breaze.hotel.entity.ReservationEntity;
import ocean.breaze.hotel.entity.RoomEntity;
import ocean.breaze.hotel.service.custom.ReservationService;

/**
 *
 * @author Kely
 */
public class ReservationServiceImpl implements ReservationService {
    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESERVATION);
    private ResDetailDao resDetailDao = (ResDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESERVATION_DETAIL);
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);

    @Override
    public String placeReservation(ReservationDto dto) throws Exception {
        Connection connection = DBConnection.getInstance().getCOnnection();

        try {
            connection.setAutoCommit(false);

            ReservationEntity reservationEntity = new ReservationEntity(dto.getResId(), dto.getDate(), dto.getCustId());
            if (reservationDao.add(reservationEntity)) {

                boolean isResDetailsSaved = true;

                for (ResDetailDto odd : dto.getResDetailDtos()) {
                    if (!resDetailDao.add(new ResDetailEntity(dto.getResId(), odd.getRoomId(), odd.getQty(), odd.getDiscount()))){
                        isResDetailsSaved = false;
                    }

                }

                if (isResDetailsSaved) {
                    boolean isRoomUpdated = true;

                    for (ResDetailDto odd : dto.getResDetailDtos()) {
                        RoomEntity roomEntity = roomDao.get(odd.getRoomId());
                        if (roomEntity != null) {
                            roomEntity.setQoh(roomEntity.getQoh() - odd.getQty());
                            if (!roomDao.update(roomEntity)) {
                                isRoomUpdated = false;
                            }
                        }

                    }

                    if (isRoomUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Room Update Error";
                    }

                } else {
                    connection.rollback();
                    return "Reservation Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Reservation Save Error";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
