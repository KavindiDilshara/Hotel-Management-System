/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.LoginDao;
import HotelManagement.entity.LoginEntity;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class LoginDaoImpl implements LoginDao{

    @Override
    public boolean add(LoginEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO users VALUES(?,?)",t.getUserId(),t.getPw());      
    }

    @Override
    public boolean update(LoginEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM users WHERE UserID=?", id);
    }

    @Override
    public LoginEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM users WHERE UserID = ? ",id);
        LoginEntity loginEntity = new LoginEntity();
        while (rst.next()) {
             loginEntity.setUserId(rst.getString("UserID"));
             loginEntity.setPw(rst.getString("PassWord"));           
        }
      return loginEntity;
    }

    @Override
    public List<LoginEntity> getAll() throws Exception {
        return null;
    }
    
}
