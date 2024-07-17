/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ocean.breaze.hotel.service.custom;

import java.util.List;
import ocean.breaze.hotel.dto.CustomerDto;
import ocean.breaze.hotel.service.SuperService;
//import ocean.breaze.hotel.service.SuperService;

/**
 *
 * @author Kely
 */
public interface CustomerService extends SuperService{   
    //CustomerDto getCustomer(String id) throws Exception; 
    //CustomerDto getAll(String id) throws Exception; 
    String addCustomer(CustomerDto dto) throws Exception;
    String updateCustomer(CustomerDto dto)throws Exception;
    String deleteCustomer(String id) throws Exception;
    String getCustomer(String id)throws Exception;
    List<CustomerDto> getAll() throws Exception;
}