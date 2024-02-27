/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service.custom.impl;

import HotelManagement.dao.DaoFactory;
import HotelManagement.dao.custom.LoginDao;
import HotelManagement.dto.userLoginDto;
import HotelManagement.entity.LoginEntity;
import HotelManagement.service.custom.UserService;

/**
 *
 * @author kavindi
 */
public class UserServiceImpl implements UserService {

    private LoginDao loginDao = (LoginDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.LOGIN);
    
    @Override
    public boolean userlogin(userLoginDto dto) throws Exception {    
        LoginEntity loginEntity = loginDao.get(dto.getUserID());
        if (dto.getPassWord().equals(loginEntity.getPw())) {
            return true;
        }
        return false;
    }

    @Override
    public String addUser(userLoginDto dto) throws Exception {
        LoginEntity loginEntity = new LoginEntity(dto.getUserID(), dto.getPassWord());
        if(loginDao.add(loginEntity)){
                return "Successfully Added";
        }
        else{
                return "Fail";
        }
    }

    @Override
    public String deleteUser(userLoginDto dto) throws Exception {
       if(userlogin(dto)){
           LoginEntity loginEntity = new LoginEntity(dto.getUserID(), dto.getPassWord());
           if(loginDao.delete(loginEntity.getUserId())){
               return "Successfully Deleted";
           }
           return "Fail";
       }
       else{
           return "Invalide User name or Password";
       }  
    }
    
}
