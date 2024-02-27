/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;

import HotelManagement.dto.RoomsDto;
import HotelManagement.service.SuperService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public interface RoomService  extends SuperService{
    String addRoom(RoomsDto dto) throws Exception;

    String updateRoom(RoomsDto dto) throws Exception;

    String deleteRoom(String id) throws Exception;
    
    RoomsDto getRoom(String id) throws Exception;
    
    List<RoomsDto> getAll() throws Exception;
   

}
