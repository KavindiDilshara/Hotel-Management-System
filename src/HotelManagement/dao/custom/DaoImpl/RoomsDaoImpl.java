/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.RoomDao;
import HotelManagement.entity.RoomsEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class RoomsDaoImpl implements RoomDao{
   
    
    @Override
    public boolean add(RoomsEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO rooms VALUES(?,?,?)", 
               t.getRoomNo(),
               t.getFlowNo(),
               t.getCtgID());
    }

    @Override
    public boolean update(RoomsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE rooms SET FlowNo=?,CtgID=? where RoomNo=?",
               t.getFlowNo(),
               t.getCtgID(),
               t.getRoomNo());
    
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM rooms WHERE RoomNo=?", id);
    }

    @Override
    public RoomsEntity get(String id) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rooms WHERE RoomNo=?",id);
      RoomsEntity roomsEntity = new RoomsEntity();
      while(rst.next()){
          roomsEntity.setRoomNo(rst.getString("RoomNo"));
          roomsEntity.setFlowNo(rst.getString("FlowNo"));
          roomsEntity.setCtgID(rst.getString("CtgID"));
      }
      return roomsEntity;
      
    }

    @Override
    public List<RoomsEntity> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rooms");
         List<RoomsEntity> roomsEntities = new ArrayList<>();
         while(rst.next()){
             roomsEntities.add(new RoomsEntity(rst.getString("RoomNo"),rst.getString("FlowNo"),rst.getString("CtgID")));
         }
         return roomsEntities;
    }
    
}
