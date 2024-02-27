/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dto;

/**
 *
 * @author kavindi
 */
public class PackageDto {
    
    private String PacId ;
    private String PacType;
    private double price;

    public PackageDto() {
    }

    public PackageDto(String PacId, String PacType, double price) {
        this.PacId = PacId;
        this.PacType = PacType;
        this.price = price;
    }

    /**
     * @return the PacId
     */
    public String getPacId() {
        return PacId;
    }

    /**
     * @param PacId the PacId to set
     */
    public void setPacId(String PacId) {
        this.PacId = PacId;
    }

    /**
     * @return the PacType
     */
    public String getPacType() {
        return PacType;
    }

    /**
     * @param PacType the PacType to set
     */
    public void setPacType(String PacType) {
        this.PacType = PacType;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PackageDto{" + "PacId=" + PacId + ", PacType=" + PacType + ", price=" + price + '}';
    }
    
    
}
