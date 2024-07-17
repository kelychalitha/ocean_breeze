/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.entity;

/**
 *
 * @author Kely
 */
public class ResDetailEntity {
    private String resId;
    private String roomId;
    private Integer qty;
    private Double discount;

    public ResDetailEntity() {
    }

    public ResDetailEntity(String resId, String roomId, Integer qty, Double discount) {
        this.resId = resId;
        this.roomId = roomId;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the resId
     */
    public String getResId() {
        return roomId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ResDetailEntity{" + "resId=" + resId + ", roomId=" + roomId + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
    
}
