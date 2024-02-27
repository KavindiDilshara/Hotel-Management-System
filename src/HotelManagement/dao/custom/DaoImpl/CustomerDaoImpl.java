/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.CustomerDao;
import HotelManagement.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?)",
                t.getCustID(),
                t.getTitle(),
                t.getName(),
                t.getAddress(),
                t.getTelNo());
                
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET Title=?,Name=?,Address=?,TelNo=? where CustID=?",
                t.getTitle(),
                t.getName(),
                t.getAddress(),
                t.getTelNo(),
                t.getCustID());
        
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", id);
        CustomerEntity entity = new CustomerEntity();
         while (rst.next()){
             entity.setCustID(rst.getString("CustID"));
             entity.setTitle(rst.getString("Title"));
             entity.setName(rst.getString("Name"));
             entity.setAddress(rst.getString("Address"));
             entity.setTelNo(rst.getString("TelNo"));
         }
         return entity;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer");
        List<CustomerEntity> custEntities = new ArrayList<>();
        while (rst.next()) {
            custEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("Title"),
                    rst.getString("Name"),
                    rst.getString("Address"),
                    rst.getString("TelNo")));
        }
        
        return custEntities;
    }
    
}
