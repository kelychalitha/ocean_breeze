/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocean.breaze.hotel.entity;

/**
 *
 * @author Kely
 */
public class CustomerEntity {
    private String custId;
    private String title;
    private String name;
    private String regDate;
    //private Double salary;
    private String address;
    private String city;
    private String province;
    private String zip;

    public CustomerEntity() {
    }

    public CustomerEntity(String custId, String title, String name, String regDate, String address, String city, String province, String zip) {
        this.custId = custId;
        this.title = title;
        this.name = name;
        this.regDate = regDate;
        //this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip = zip;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the dob to set
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the salary
     */
    //public Double getSalary() {
        //return salary;
    //}

    /**
     * @param salary the salary to set
     */
    //public void setSalary(Double salary) {
       // this.salary = salary;
    //}

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "custId=" + custId + ", title=" + title + ", name=" + name + ", regDate=" + regDate + ", address=" + address + ", city=" + city + ", province=" + province + ", zip=" + zip + '}';
    }
    
    
}
