/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.dto;


import java.util.List;

//import ocean.breaze.hotel.dto.ResDetailDto;

/**
 *
 * @author Kely
 */
public class ReservationDto {
    private String resId;
    private String custId;
    private String date;
    
    private List<ResDetailDto> resDetailDtos;

    public ReservationDto() {
        
    }

    public ReservationDto(String resId, String custId, String date, List<ResDetailDto> resDetailDtos) {
        this.resId = resId;
        this.custId = custId;
        this.date = date;
        this.resDetailDtos = resDetailDtos;
    }

    /**
     * @return the resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
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
     * @return the resDetailDtos
     */
    public List<ResDetailDto> getResDetailDtos() {
        return resDetailDtos;
    }

    /**
     * @param resDetailDtos the resDetailDtos to set
     */
    public void setResDetailDtos(List<ResDetailDto> resDetailDtos) {
        this.resDetailDtos = resDetailDtos;
    } 
    
    @Override
    public String toString() {
        return "ReservationDto{" + "reservationId=" + resId + ", custId=" + custId + ", date=" + date + ", resDetailDtos=" + resDetailDtos + '}';
    }
    
}
