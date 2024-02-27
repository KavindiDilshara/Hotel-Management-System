/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HotelManagement.service.custom;

import HotelManagement.dto.CustDto;
import HotelManagement.service.SuperService;
import java.util.List;

/**
 *
 * @author kavindi
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustDto dto) throws Exception;

    String updateCustomer(CustDto dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustDto getCustomer(String id) throws Exception;
    
    List<CustDto> getAll() throws Exception;
}
