/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dao;

import ocean.breaze.hotel.dao.custom.impl.CustomerDaoImpl;
import ocean.breaze.hotel.dao.custom.impl.RoomDaoImpl;
import ocean.breaze.hotel.dao.custom.impl.ResDetailDaoImpl;
import ocean.breaze.hotel.dao.custom.impl.ReservationDaoImpl;
/**
 *
 * @author Kely
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case ROOM:
                return new RoomDaoImpl();
            case RESERVATION:
                return new ReservationDaoImpl();
            case RESERVATION_DETAIL:
                return new ResDetailDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        ROOM, RESERVATION, RESERVATION_DETAIL, CUSTOMER
    }
}
