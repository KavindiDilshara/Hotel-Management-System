/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.ReservationsDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.ReservationsService;
import java.util.Date;

/**
 *
 * @author kavindi
 */
public class ReservationsController {

    private ReservationsService rsvService = (ReservationsService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESEVATIONS);
    
    public ReservationsDto searchResevation(String id) throws Exception{
       return rsvService.getReservations(id);
    }

    public String saveResevation(ReservationsDto RsvDto)throws Exception {
        return rsvService.addReservation(RsvDto);
    }

    public Double calAmount(String ctId, String pcId,Date std,Date end) throws Exception{
        return rsvService.calAmount(ctId,pcId,std,end);
    }

    public String updateResevation(ReservationsDto Dto) throws Exception{
        return rsvService.updateReservation(Dto);
    }

    public String cancelResevation(String id)throws Exception {
       return rsvService.deleteReservations(id);
    }
    
}
