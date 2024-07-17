/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dao.custom.impl;

import ocean.breaze.hotel.dao.CrudUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ocean.breaze.hotel.dao.custom.CustomerDao;
import ocean.breaze.hotel.entity.CustomerEntity;

/**
 *
 * @author Kely
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?)",
                t.getCustId(),
                t.getTitle(),
                t.getName(),
                t.getRegDate(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET  CustTitle=?,"
                + "CustName=?, CustAddress=?, Province=?, PostalCode=? WHERE CustID=?",
                t.getCustId(),
                t.getTitle(),
                t.getName(),
                //t.getRegDate(),
                t.getAddress(),
                //t.getCity(),
                t.getProvince(),
                t.getZip());
                //t.getCustId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
            rst.getString("CustID"),
            rst.getString("CustTitle"),
            rst.getString("CustName"),
            rst.getString("Reg"),
            rst.getString("CustAddress"),
            rst.getString("City"),
            rst.getString("Province"),
            rst.getString("PostalCode"));
            
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while(rst.next()){
            customerEntities.add(new CustomerEntity(
            rst.getString("CustID"),
            rst.getString("CustTitle"),
            rst.getString("CustName"),
            rst.getString("Reg"),
            rst.getString("CustAddress"),
            rst.getString("City"),
            rst.getString("Province"),
            rst.getString("PostalCode")));
        }
        return (ArrayList<CustomerEntity>) customerEntities;
    }

}
