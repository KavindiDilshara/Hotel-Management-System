/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.entity;

/**
 *
 * @author kavindi
 */
public class CustomerEntity {
    
    private String custID;
    private String title;
    private String name;
    private String address;
    private String telNo ; 

    public CustomerEntity() {
    }

    public CustomerEntity(String custID, String title, String name, String address, String telNo) {
        this.custID = custID;
        this.title = title;
        this.name = name;
        this.address = address;
        this.telNo = telNo;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
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
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "custID=" + custID + ", title=" + title + ", name=" + name + ", address=" + address + ", telNo=" + telNo + '}';
    }
    
    
    
    
}
