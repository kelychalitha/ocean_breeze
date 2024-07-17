/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.controller;

import ocean.breaze.hotel.dto.ReservationDto;
import ocean.breaze.hotel.service.ServiceFactory;
import ocean.breaze.hotel.service.custom.ReservationService;

/**
 *
 * @author Kely
 */
public class ReservationController {
    private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);
    
    public String placeResvervation(ReservationDto dto) throws Exception{
        return reservationService.placeReservation(dto);
    }
}
