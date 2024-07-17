/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.entity;

/**
 *
 * @author Kely
 */
public class RoomEntity {
    private String roomId;
    private String category;
    private String pack;
    private Double unitPrice;
    private Integer qoh;

    public RoomEntity() {
    }

    public RoomEntity(String roomId, String category, String pack, Double unitPrice, Integer qoh) {
        this.roomId = roomId;
        this.category = category;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the roomCode
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
     * @return the description
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the description to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "RoomEntity{" + "roomId=" + roomId + ", category=" + category + ", pack=" + pack + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
}
