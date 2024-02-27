/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.entity;

/**
 *
 * @author kavindi
 */
public class RoomsEntity {
    private String RoomNo;
    private String FlowNo;
    private String CtgID;

    public RoomsEntity() {
    }

    public RoomsEntity(String RoomNo, String FlowNo, String CtgID) {
        this.RoomNo = RoomNo;
        this.FlowNo = FlowNo;
        this.CtgID = CtgID;
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
     * @return the FlowNo
     */
    public String getFlowNo() {
        return FlowNo;
    }

    /**
     * @param FlowNo the FlowNo to set
     */
    public void setFlowNo(String FlowNo) {
        this.FlowNo = FlowNo;
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

    @Override
    public String toString() {
        return "RoomsEntity{" + "RoomNo=" + RoomNo + ", FlowNo=" + FlowNo + ", CtgID=" + CtgID + '}';
    }
    
    
}
