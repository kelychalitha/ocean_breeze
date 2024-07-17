/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.service;

import ocean.breaze.hotel.service.custom.impl.CustomerServiceImpl;
import ocean.breaze.hotel.service.custom.impl.ReservationServiceImpl;
import ocean.breaze.hotel.service.custom.impl.RoomServiceImpl;

/**
 *
 * @author Kely
 */
public class ServiceFactory {
     private static ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType serviceType) {
        switch (serviceType) {
            case ROOM:
                return new RoomServiceImpl();
                case RESERVATION:
                return new ReservationServiceImpl();
                case CUSTOMER:
                return (SuperService) new CustomerServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ROOM, CUSTOMER, RESERVATION
    }
}
