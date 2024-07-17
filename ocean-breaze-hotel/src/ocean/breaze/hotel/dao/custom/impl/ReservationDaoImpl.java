/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dao.custom.impl;

import java.util.ArrayList;
import ocean.breaze.hotel.dao.CrudUtil;
import ocean.breaze.hotel.dao.custom.ReservationDao;
//import ocean.breaze.hotel.dao.custom.ResDetailDao;
//import ocean.breaze.hotel.entity.ResDetailEntity;
import ocean.breaze.hotel.entity.ReservationEntity;

/**
 *
 * @author Kely
 */
public class ReservationDaoImpl implements ReservationDao{
     @Override
    public boolean add(ReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", t.getId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ReservationEntity> getAll() throws Exception {
        return null;
    }
}
