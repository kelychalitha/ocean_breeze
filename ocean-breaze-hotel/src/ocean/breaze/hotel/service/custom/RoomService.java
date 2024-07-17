/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ocean.breaze.hotel.service.custom;

import java.util.List;
import ocean.breaze.hotel.dto.RoomDto;
import ocean.breaze.hotel.service.SuperService;

/**
 *
 * @author Kely
 */
public interface RoomService extends SuperService {
    String saveRoom(RoomDto roomDto) throws Exception;
    String UpdateRoom(RoomDto roomDto) throws Exception;
    String deleteRoom(String roomId) throws Exception;
    RoomDto getRoom(String roomId) throws Exception;
    List<RoomDto> getAll() throws Exception;
}
