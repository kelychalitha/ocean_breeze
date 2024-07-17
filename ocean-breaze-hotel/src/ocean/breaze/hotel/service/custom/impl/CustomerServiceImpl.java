/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import ocean.breaze.hotel.dao.DaoFactory;
import ocean.breaze.hotel.dao.custom.CustomerDao;
import ocean.breaze.hotel.dto.CustomerDto;
import ocean.breaze.hotel.entity.CustomerEntity;
import ocean.breaze.hotel.service.custom.CustomerService;

/**
 *
 * @author Kely
 */
public class CustomerServiceImpl implements CustomerService{
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    
    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(), dto.getTitle(),
                dto.getName(), dto.getReg(),
                 dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.add(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

     @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                dto.getCustId(), dto.getTitle(),
                dto.getName(), dto.getReg(),
               dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    /*@Override
    public String deleteCustomer(CustomerDto dto) throws Exception {
        if(customerDao.delete(dto.getCustId())){
           return "Successfully Deleted";
        }else{
            return "Failed";
        }     
    }
*/

    /*@Override
    public String getCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        if (entity != null) {
            return new CustomerDto(entity.getCustId(),
                    entity.getTitle(), entity.getName(), entity.getRegDate(),
                     entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip());
        }
        return null;
    }*/


    @Override
    public List<CustomerDto> getAll() throws Exception {
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {
            customerDtos.add(new CustomerDto(entity.getCustId(),
                    entity.getTitle(), entity.getName(), entity.getRegDate(),
                     entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip()));
        }
        return customerDtos;
    }

    /*@Override
    public String getCustomer(CustomerDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public String deleteCustomer(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCustomer(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
