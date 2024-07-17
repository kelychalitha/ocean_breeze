/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dao.custom.impl;

import java.util.ArrayList;
import ocean.breaze.hotel.dao.CrudUtil;
import ocean.breaze.hotel.dao.custom.ResDetailDao;
import ocean.breaze.hotel.entity.ResDetailEntity;

/**
 *
 * @author Kely
 */
public class ResDetailDaoImpl implements ResDetailDao {
    @Override
    public boolean add(ResDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO ResDetail VALUES(?,?,?,?)", t.getResId(), t.getRoomId(), t.getQty(), t.getDiscount());

    }

    @Override
    public boolean update(ResDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public ResDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ResDetailEntity> getAll() throws Exception {
        return null;
    }

}
