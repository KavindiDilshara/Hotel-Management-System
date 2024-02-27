/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.entity;

/**
 *
 * @author kavindi
 */
public class CategoryEntity {

    private String CtgID;
    private String CategoryType;
    private Double Price;
    private int NumOfRooms;

    public CategoryEntity() {
    }

    public CategoryEntity(String CtgID, String CategoryType, Double Price, int NumOfRooms) {
        this.CtgID = CtgID;
        this.CategoryType = CategoryType;
        this.Price = Price;
        this.NumOfRooms = NumOfRooms;
    }

    /**
     * @return the CtgID
     */
    public String getCtgID() {
        return CtgID;
    }

    /**
     * @param CtgID the CtgID to set
     */
    public void setCtgID(String CtgID) {
        this.CtgID = CtgID;
    }

    /**
     * @return the CategoryType
     */
    public String getCategoryType() {
        return CategoryType;
    }

    /**
     * @param CategoryType the CategoryType to set
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * @return the Price
     */
    public Double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    /**
     * @return the NumOfRooms
     */
    public int getNumOfRooms() {
        return NumOfRooms;
    }

    /**
     * @param NumOfRooms the NumOfRooms to set
     */
    public void setNumOfRooms(int NumOfRooms) {
        this.NumOfRooms = NumOfRooms;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "CtgID=" + CtgID + ", CategoryType=" + CategoryType + ", Price=" + Price + ", NumOfRooms=" + NumOfRooms + '}';
    }

    
}
