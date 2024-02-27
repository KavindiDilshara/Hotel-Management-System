/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.RoomsDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.RoomService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class RoomController {

        private RoomService roomService = (RoomService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMS);
    
    public List<RoomsDto> getAll() throws Exception {
        return roomService.getAll();
    }

    public RoomsDto searchRoom(String id)throws Exception {
        return roomService.getRoom(id);
    };

    public String saveRoom(RoomsDto dto)throws Exception {
        return roomService.addRoom(dto);
    }

    public String updateRoom(RoomsDto dto) throws Exception{
           return roomService.updateRoom(dto);
    }

    public String deleteRoom(String id)throws Exception {
        return roomService.deleteRoom(id);
    }
    
    
    
    
    
    
}
