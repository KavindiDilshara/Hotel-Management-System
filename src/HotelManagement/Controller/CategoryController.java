/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.CategoryDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.CategoryService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class CategoryController {

    private CategoryService categoryService = (CategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    
    public List<CategoryDto> getAll()throws Exception {
        return categoryService.getAll();
    }

    public CategoryDto searchCategory(String id) throws Exception {
        return categoryService.getCategory(id);
    }

    public String saveCategory(CategoryDto dto) throws Exception {
       return categoryService.addCategory(dto);
    }

    public String updateCategory(CategoryDto dto) throws Exception{
       return categoryService.updateCategory(dto);
    }

    public String deleteCategory(String id) throws Exception{
        return categoryService.deleteCategory(id);
    }

   
    
    
}
