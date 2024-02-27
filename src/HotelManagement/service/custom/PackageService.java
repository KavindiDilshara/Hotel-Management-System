/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;


import HotelManagement.dto.CategoryDto;
import HotelManagement.dto.PackageDto;
import HotelManagement.service.SuperService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public interface PackageService extends SuperService{
    String addPackage(PackageDto dto) throws Exception;

    String updatePackage(PackageDto dto) throws Exception;

    String deletePackage(String id) throws Exception;
    
    PackageDto getPackage(String id) throws Exception;
    
    List<PackageDto> getAll() throws Exception;
}
