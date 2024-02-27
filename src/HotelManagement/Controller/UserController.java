/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.userLoginDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.UserService;

/**
 *
 * @author kavindi
 */
public class UserController {

    private UserService userService = (UserService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.LOGIN);
    
    public Boolean login(userLoginDto dto) throws Exception{
       return userService.userlogin(dto);
    }

    public String addUser(userLoginDto dto) throws Exception {
        return userService.addUser(dto);
    }

    public String deleteUser(userLoginDto dto) throws Exception{
        return userService.deleteUser(dto);
    }

   
    
    
    
    
}
