/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.controller;

import java.util.ArrayList;
import java.util.List;
import ocean.breaze.hotel.dto.CustomerDto;
import ocean.breaze.hotel.dto.RoomDto;
import ocean.breaze.hotel.service.ServiceFactory;
import ocean.breaze.hotel.service.custom.CustomerService;
/**
 *
 * @author Kely
 */
public class CustomerController {
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer (String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public String getCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAll();
    }

    /*public CustomerDto searchCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    
    
}
