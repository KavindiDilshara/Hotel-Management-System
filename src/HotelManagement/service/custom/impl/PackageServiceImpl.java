/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service.custom.impl;

import HotelManagement.dao.DaoFactory;
import HotelManagement.dao.custom.PackageDao;
import HotelManagement.dto.CategoryDto;
import HotelManagement.dto.PackageDto;
import HotelManagement.entity.PackageEntity;
import HotelManagement.service.custom.PackageService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class PackageServiceImpl implements PackageService {

    private PackageDao  packageDao = (PackageDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.PACKAGE);
    
    @Override
    public String addPackage(PackageDto dto) throws Exception {
        PackageEntity packEntity = new PackageEntity(dto.getPacId(),dto.getPacType(),dto.getPrice());
        boolean rsp = packageDao.add(packEntity);
        if(rsp){
            return "Saved Sucessfully";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String updatePackage(PackageDto dto) throws Exception {
        PackageEntity packEntity = new PackageEntity(dto.getPacId(),dto.getPacType(),dto.getPrice());
        boolean rsp = packageDao.update(packEntity);
        if(rsp){
            return "Update Sucessfully";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String deletePackage(String id) throws Exception {
        boolean rsp = packageDao.delete(id);
        if (rsp) {
            return "Delete Sucessfully";
        } else {
            return "Fail";
        }
    }

    @Override
    public PackageDto getPackage(String id) throws Exception {
       PackageEntity packEntity = packageDao.get(id);
       PackageDto packDto = new PackageDto();
       if(packEntity != null){
           packDto.setPacId(packEntity.getPacId());
           packDto.setPacType(packEntity.getPacType());
           packDto.setPrice(packEntity.getPrice());
       }
       return packDto;
    }

    @Override
    public List<PackageDto> getAll() throws Exception {
        List<PackageEntity> packEntities = packageDao.getAll();
        List<PackageDto> packDtos = new ArrayList<>();
        for(PackageEntity entity : packEntities){
            packDtos.add(new PackageDto(entity.getPacId(),entity.getPacType(),entity.getPrice()));
        }
        return packDtos;
    }
    
}
