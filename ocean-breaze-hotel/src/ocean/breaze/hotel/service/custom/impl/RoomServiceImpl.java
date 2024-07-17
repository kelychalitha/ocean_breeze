/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import ocean.breaze.hotel.dao.DaoFactory;
import ocean.breaze.hotel.dao.custom.RoomDao;
import ocean.breaze.hotel.dto.RoomDto;
import ocean.breaze.hotel.entity.RoomEntity;
import ocean.breaze.hotel.service.custom.RoomService;

/**
 *
 * @author Kely
 */
public class RoomServiceImpl implements RoomService{
     private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);

    @Override
    public String saveRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(dto.getRoomId(), dto.getCategory(),
                dto.getPack(), dto.getUnitPrice(), dto.getQoh());
        if (roomDao.add(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String UpdateRoom(RoomDto roomDto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(roomDto.getRoomId(), roomDto.getCategory(),
                roomDto.getPack(), roomDto.getUnitPrice(), roomDto.getQoh());
        if (roomDao.update(roomEntity)) {
            return "Successfully updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteRoom(String roomId) throws Exception {
        if (roomDao.delete(roomId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }

    }

    @Override
    public RoomDto getRoom(String roomId) throws Exception {
        RoomEntity roomEntity = roomDao.get(roomId);
        return new RoomDto(roomEntity.getRoomId(),
        roomEntity.getCategory(),
        roomEntity.getPack(),
        roomEntity.getUnitPrice(),
        roomEntity.getQoh());
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
        ArrayList<RoomEntity> roomEntities = roomDao.getAll();
        
        List<RoomDto> roomDtos = new ArrayList<>();
        
        for(RoomEntity roomEntity : roomEntities){
           roomDtos.add(new RoomDto(roomEntity.getRoomId(),
           roomEntity.getCategory(),
           roomEntity.getPack(),
           roomEntity.getUnitPrice(),
           roomEntity.getQoh())); 
        }
        return roomDtos;
    }

}
