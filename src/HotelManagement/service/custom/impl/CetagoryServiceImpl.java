/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service.custom.impl;

import HotelManagement.dao.DaoFactory;
import HotelManagement.dao.custom.CategoryDao;
import HotelManagement.dto.CategoryDto;
import HotelManagement.dto.CustDto;
import HotelManagement.entity.CategoryEntity;
import HotelManagement.service.custom.CategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class CetagoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    
    @Override
    public String addCategory(CategoryDto dto) throws Exception {
        CategoryEntity ctEntities = new CategoryEntity(dto.getCtgID(),dto.getCategoryType(),dto.getPrice(),dto.getNumOfRooms());
        boolean rep = categoryDao.add(ctEntities);
        if(rep){
            return "Sucessfully Saved";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String updateCategory(CategoryDto dto) throws Exception {
        CategoryEntity ctEntities = new CategoryEntity(dto.getCtgID(),dto.getCategoryType(),dto.getPrice(),dto.getNumOfRooms());
        boolean rep = categoryDao.update(ctEntities);
        if(rep){
            return "Sucessfully Update";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String deleteCategory(String id) throws Exception {
        boolean rep = categoryDao.delete(id);
        if(rep){
            return "Sucessfully Deleted";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public CategoryDto getCategory(String id) throws Exception {
        CategoryEntity ctEntities = categoryDao.get(id);
        CategoryDto dto = new CategoryDto();
        if(ctEntities != null){
            dto.setCtgID(ctEntities.getCtgID());
            dto.setCategoryType(ctEntities.getCategoryType());
            dto.setPrice(ctEntities.getPrice());
            dto.setNumOfRooms(ctEntities.getNumOfRooms());
        }
        return dto;
    }

    @Override
    public List<CategoryDto> getAll() throws Exception {
        List<CategoryEntity> ctEntities = categoryDao.getAll();
        List<CategoryDto> ctDtos = new ArrayList<>();
        for(CategoryEntity entity :ctEntities ){
            ctDtos.add(new CategoryDto(entity.getCtgID(),entity.getCategoryType(),entity.getPrice(),entity.getNumOfRooms()));
        }
        return ctDtos;
    }

    
}
