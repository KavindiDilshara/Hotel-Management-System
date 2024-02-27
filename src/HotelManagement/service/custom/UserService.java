/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;

import HotelManagement.dto.userLoginDto;
import HotelManagement.service.SuperService;

/**
 *
 * @author kavindi
 */
public interface UserService extends SuperService{
    
    boolean userlogin(userLoginDto dto) throws Exception;

    public String addUser(userLoginDto dto)throws Exception;

    public String deleteUser(userLoginDto dto)throws Exception;
    
}
