/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.CategoryDao;
import HotelManagement.entity.CategoryEntity;
import HotelManagement.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class CategoryDaoImpl implements CategoryDao{

    @Override
    public boolean add(CategoryEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?,?,?)",
               t.getCtgID(),
               t.getCategoryType(),
               t.getPrice(),
               t.getNumOfRooms());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE category SET CategoryType=?,Price=?,NumOfRooms=? WHERE CtgID=?",
               t.getCategoryType(),
               t.getPrice(),
               t.getNumOfRooms(),
               t.getCtgID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM category WHERE CtgID=?", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE CtgID = ?",id);
        CategoryEntity ctEntity = new CategoryEntity();
        while (rst.next()){
            ctEntity.setCtgID(rst.getString("CtgID"));
            ctEntity.setCategoryType(rst.getString("CategoryType"));
            ctEntity.setPrice(rst.getDouble("Price"));
            ctEntity.setNumOfRooms(rst.getInt("NumOfRooms"));
        }
        return ctEntity;
        
    }

    @Override
    public List<CategoryEntity> getAll() throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
        List<CategoryEntity> ctEntities = new ArrayList<>();
        while (rst.next()) {
            ctEntities.add(new CategoryEntity(
                    rst.getString("CtgID"),
                    rst.getString("CategoryType"),
                    rst.getDouble("Price"),
                    rst.getInt("NumOfRooms")));
        }
        return ctEntities;
    }
    
}
