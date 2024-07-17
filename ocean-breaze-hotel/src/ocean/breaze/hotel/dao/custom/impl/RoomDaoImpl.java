/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import ocean.breaze.hotel.dao.CrudUtil;
import ocean.breaze.hotel.dao.custom.ReservationDao;
import ocean.breaze.hotel.dao.custom.RoomDao;
import ocean.breaze.hotel.entity.ReservationEntity;
import ocean.breaze.hotel.entity.RoomEntity;

/**
 *
 * @author Kely
 */
public class RoomDaoImpl implements RoomDao{
    @Override
    public boolean add(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO ROOM VALUES(?,?,?,?,?)",
                t.getRoomId(),
                t.getCategory(),
                t.getPack(),
                t.getUnitPrice(),
                t.getQoh());
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Room SET Category=?, Pack=?, UnitPrice=?, QtyOnHand=? WHERE RoomId=?", 
                t.getCategory(),
                t.getPack(),
                t.getUnitPrice(),
                t.getQoh(),
                t.getRoomId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM room WHERE RoomId=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room WHERE RoomId=?", id);
        while (rst.next()) {
            return new RoomEntity(rst.getString("RoomId"),
                    rst.getString("Category"),
                    rst.getString("Pack"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"));
        }
        return null;
    }

    @Override
    public ArrayList<RoomEntity> getAll() throws Exception {
        ArrayList<RoomEntity> roomEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room");
        while (rst.next()) {
            roomEntities.add(new RoomEntity(rst.getString("RoomId"),
                    rst.getString("Category"),
                    rst.getString("Pack"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand")));
        }
        return roomEntities;
    }

}
