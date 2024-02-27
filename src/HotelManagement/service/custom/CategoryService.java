/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;

import HotelManagement.dao.custom.CategoryDao;
import HotelManagement.dto.CategoryDto;
import HotelManagement.dto.CustDto;
import HotelManagement.service.SuperService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public interface CategoryService extends SuperService{
    
    String addCategory(CategoryDto dto) throws Exception;
    String updateCategory(CategoryDto dto) throws Exception;
    String deleteCategory(String id) throws Exception; 
    CategoryDto getCategory(String id) throws Exception;
    List<CategoryDto> getAll() throws Exception;
}
