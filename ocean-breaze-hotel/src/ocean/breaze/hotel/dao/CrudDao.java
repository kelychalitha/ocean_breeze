/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ocean.breaze.hotel.dao;

import java.util.ArrayList;

/**
 *
 * @author Kely
 */
public interface CrudDao<T, ID> extends SuperDao{
    boolean add(T t) throws Exception;
    boolean update(T t) throws Exception;
    boolean delete(ID id) throws Exception;
    T get (ID id) throws Exception;
    ArrayList<T> getAll() throws Exception;
}
