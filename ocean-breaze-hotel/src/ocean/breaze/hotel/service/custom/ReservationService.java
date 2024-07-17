/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ocean.breaze.hotel.service.custom;

import ocean.breaze.hotel.dto.ReservationDto;
import ocean.breaze.hotel.service.SuperService;

/**
 *
 * @author Kely
 */
public interface ReservationService extends SuperService {
    String placeReservation(ReservationDto dto) throws Exception;

}
