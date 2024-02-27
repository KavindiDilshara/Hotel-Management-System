/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service.custom.impl;

import HotelManagement.dao.DaoFactory;
import HotelManagement.dao.custom.CategoryDao;
import HotelManagement.dao.custom.PackageDao;
import HotelManagement.dao.custom.ReservationsDao;
import HotelManagement.dto.ReservationsDto;
import HotelManagement.entity.CategoryEntity;
import HotelManagement.entity.PackageEntity;
import HotelManagement.entity.ReservationsEntity;
import HotelManagement.service.custom.ReservationsService;
import java.util.Date;
import java.util.List;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author kavindi
 */
public class ReservationsServiceImpl implements ReservationsService {

    private ReservationsDao rsvDao = (ReservationsDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESEVATIONS);
    private CategoryDao categoryDao = (CategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    private PackageDao  packageDao = (PackageDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.PACKAGE);
    
    @Override
    public String addReservation(ReservationsDto dto) throws Exception {
        ReservationsEntity entity = new ReservationsEntity(dto.getResNo(),dto.getCustID(),dto.getRoomNo(),dto.getCtgID(),dto.getPackageID(),dto.getStartDate(),dto.getStartDate(),dto.getAmount(),dto.getTime());
        if(rsvDao.add(entity)){
            return "Successfully Reseved";
        }
        else{
            return "Fail to Reseved";
        }
        
    }

    @Override
    public String updateReservation(ReservationsDto dto) throws Exception {
        ReservationsEntity entity = new ReservationsEntity(dto.getResNo(),dto.getCustID(),dto.getRoomNo(),dto.getCtgID(),dto.getPackageID(),dto.getStartDate(),dto.getStartDate(),dto.getAmount(),dto.getTime());
        if(rsvDao.update(entity)){
            return "Successfully Updated";
        }
        else{
            return "Fail to Update";
        }
    }

    @Override
    public String deleteReservations(String id) throws Exception {
        ReservationsEntity entity = rsvDao.get(id);
        long Difference = (Duration.between(entity.getTime(),LocalDateTime.now())).toHours();
        if(Difference <= 24){
            if(rsvDao.delete(id)){
                return "Successfull Canceled";
            }
            else return "Fail to Cancel";
        }
        else {
            return "Unable to cancel resevation due to expired time period ";
        }
    }

    @Override
    public ReservationsDto getReservations(String id) throws Exception {
        ReservationsEntity entity = rsvDao.get(id);
        ReservationsDto rsvDto = new ReservationsDto();
       if(entity != null) {
            rsvDto.setResNo(entity.getResNo());
            rsvDto.setCustID(entity.getCustID());
            rsvDto.setRoomNo(entity.getRoomNo());
            rsvDto.setCtgID(entity.getCtgID());
            rsvDto.setPackageID(entity.getPackageID());
            rsvDto.setStartDate(entity.getStartDate());
            rsvDto.setEndDate(entity.getEndDate());
            rsvDto.setAmount(entity.getAmount());
            rsvDto.setTime(entity.getTime());
        }
        return rsvDto;
    }

    @Override
    public List<ReservationsDto> getAll() throws Exception {
        return null;
    }

    @Override
    public Double calAmount(String ctId, String pcId, Date std, Date end) throws Exception {
        CategoryEntity ctEntity = categoryDao.get(ctId);
        PackageEntity pcEntity = packageDao.get(pcId);

        long deference = (end.getTime() - std.getTime()) / (24 * 60 * 60 * 1000);
        if (deference == 0) {
            return (ctEntity.getPrice() + pcEntity.getPrice());

        } else {
            return (ctEntity.getPrice() + pcEntity.getPrice()) * deference;
        }

    }
    
}
