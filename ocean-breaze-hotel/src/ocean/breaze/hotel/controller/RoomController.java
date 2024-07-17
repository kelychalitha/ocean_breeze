/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.controller;

import java.util.List;
import ocean.breaze.hotel.dto.RoomDto;
import ocean.breaze.hotel.service.ServiceFactory;
import ocean.breaze.hotel.service.custom.RoomService;

/**
 *
 * @author Kely
 */
public class RoomController {
    private  RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);
    
    public String save(RoomDto roomDto)throws Exception {
        return roomService.saveRoom(roomDto);
    }
    
    public String update(RoomDto roomDto)throws Exception {
        return roomService.UpdateRoom(roomDto);
    }
    
    public String delete(String roomId)throws Exception {
        return roomService.deleteRoom(roomId);
    }
    
    public RoomDto get(String roomId)throws Exception {
        return roomService.getRoom(roomId);
    }
    
    public List<RoomDto> getAll()throws Exception {
        return roomService.getAll();
    }
    
    
}
