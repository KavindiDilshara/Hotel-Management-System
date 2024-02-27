/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;

import HotelManagement.dto.ReservationsDto;
import HotelManagement.service.SuperService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kavindi
 */
public interface ReservationsService extends SuperService {
    
    String addReservation(ReservationsDto dto) throws Exception;
    String updateReservation(ReservationsDto dto) throws Exception;
    String deleteReservations(String id) throws Exception; 
    ReservationsDto getReservations(String id) throws Exception;
    List<ReservationsDto> getAll() throws Exception;
    Double calAmount(String ctId , String pcId , Date std, Date end) throws Exception;
    
}
