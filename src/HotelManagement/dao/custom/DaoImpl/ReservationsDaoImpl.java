/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.ReservationsDao;
import HotelManagement.dto.ReservationsDto;
import HotelManagement.entity.ReservationsEntity;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class ReservationsDaoImpl implements ReservationsDao{

    @Override
    public boolean add(ReservationsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservations VALUES(?,?,?,?,?,?,?,?,?)",
                t.getResNo(),
                t.getCustID(),
                t.getRoomNo(),
                t.getCtgID(),
                t.getPackageID(),
                t.getStartDate(),
                t.getEndDate(),
                t.getAmount(),
                t.getTime());
                
    }

    @Override
    public boolean update(ReservationsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE reservations SET CustID=?,RoomNo=?,CtgID=?,PackageID=?,StartDate=?,EndDate=?,Amount=?,Time=? where ResNo=?",
                t.getCustID(),
                t.getRoomNo(),
                t.getCtgID(),
                t.getPackageID(),
                t.getStartDate(),
                t.getEndDate(),
                t.getAmount(),
                t.getTime(),
                t.getResNo());  
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM reservations WHERE ResNo=?", id);
    }

    @Override
    public ReservationsEntity get(String id) throws Exception {
       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservations WHERE ResNo = ?", id); 
       ReservationsEntity entity = new ReservationsEntity();
        while (rst.next()) {
            entity.setResNo(rst.getString("ResNo"));
            entity.setCustID(rst.getString("CustID"));
            entity.setRoomNo(rst.getString("RoomNo"));
            entity.setCtgID(rst.getString("CtgID"));
            entity.setPackageID(rst.getString("PackageID"));
            entity.setStartDate(rst.getDate("StartDate"));
            entity.setEndDate(rst.getDate("EndDate"));
            entity.setAmount(rst.getDouble("Amount"));
            entity.setTime((rst.getTimestamp("Time")).toLocalDateTime());
        }
        return entity;
        /*rst.getDate("Time").toLocalDate()*/
    }

    @Override
    public List<ReservationsEntity> getAll() throws Exception {
       return null;
    }
    
}
