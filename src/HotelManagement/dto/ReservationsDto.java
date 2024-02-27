/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dto;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author kavindi
 */
public class ReservationsDto {
    
    private String ResNo;
    private String CustID;
    private String RoomNo;
    private String CtgID;
    private String PackageID;
    private Date StartDate;
    private Date EndDate;
    private Double Amount;
    private LocalDateTime Time;

    public ReservationsDto() {
    }

    public ReservationsDto(String ResNo, String CustID, String RoomNo, String CtgID, String PackageID, Date StartDate, Date EndDate, Double Amount, LocalDateTime Time) {
        this.ResNo = ResNo;
        this.CustID = CustID;
        this.RoomNo = RoomNo;
        this.CtgID = CtgID;
        this.PackageID = PackageID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Amount = Amount;
        this.Time = Time;
    }

    /**
     * @return the ResNo
     */
    public String getResNo() {
        return ResNo;
    }

    /**
     * @param ResNo the ResNo to set
     */
    public void setResNo(String ResNo) {
        this.ResNo = ResNo;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the RoomNo
     */
    public String getRoomNo() {
        return RoomNo;
    }

    /**
     * @param RoomNo the RoomNo to set
     */
    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
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
     * @return the PackageID
     */
    public String getPackageID() {
        return PackageID;
    }

    /**
     * @param PackageID the PackageID to set
     */
    public void setPackageID(String PackageID) {
        this.PackageID = PackageID;
    }

    /**
     * @return the StartDate
     */
    public Date getStartDate() {
        return StartDate;
    }

    /**
     * @param StartDate the StartDate to set
     */
    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * @return the EndDate
     */
    public Date getEndDate() {
        return EndDate;
    }

    /**
     * @param EndDate the EndDate to set
     */
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * @return the Amount
     */
    public Double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Time
     */
    public LocalDateTime getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(LocalDateTime Time) {
        this.Time = Time;
    }
    

    
}
