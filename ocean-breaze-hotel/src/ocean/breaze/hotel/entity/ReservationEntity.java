/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.entity;

/**
 *
 * @author Kely
 */
public class ReservationEntity {
    
    private String id;
    private String date;
    private String custId;

    public ReservationEntity() {
    }

    public ReservationEntity(String id, String date, String custId) {
        this.id = id;
        this.date = date;
        this.custId = custId;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" + "id=" + id + ", date=" + date + ", custId=" + custId + '}';
    }
}
