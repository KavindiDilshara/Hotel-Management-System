/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.Controller;

import HotelManagement.dto.CustDto;
import HotelManagement.service.ServiceFactory;
import HotelManagement.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author kavindi
 */

public class CustomerController {

    private CustomerService customerService = (CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public List<CustDto> getAll() throws Exception {
        return customerService.getAll();
    }

    public CustDto searchCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }

    public String updateCustomer(CustDto dto)throws Exception {
       return customerService.updateCustomer(dto);
    }

    public String saveCustomer(CustDto dto) throws Exception {
        return customerService.addCustomer(dto);
    }

    public String deleteCustomer(String id)throws Exception {
        return customerService.deleteCustomer(id);
    }
    
}
