/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.PackageDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.PackageService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class PackageController {
    
    private PackageService packageSrevice = (PackageService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PACKAGE);
    
    public List<PackageDto> getAll() throws Exception {
       return packageSrevice.getAll();
    }

    public PackageDto searchPackage(String id) throws Exception{
        return packageSrevice.getPackage(id);
    }

    public String saevPackage(PackageDto dto) throws Exception{
        return packageSrevice.addPackage(dto);
    }

    public String updatePackage(PackageDto dto) throws Exception{
       return packageSrevice.updatePackage(dto);
    }

    public String deletePackage(String id)throws Exception{
        return packageSrevice.deletePackage(id);
    }

    
    
    
    
    
}
