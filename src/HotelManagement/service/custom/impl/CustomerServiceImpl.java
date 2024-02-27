/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service.custom.impl;

import HotelManagement.dao.DaoFactory;
import HotelManagement.dao.custom.CustomerDao;
import HotelManagement.dto.CustDto;
import HotelManagement.entity.CustomerEntity;
import HotelManagement.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao = (CustomerDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    
    @Override
    public String addCustomer(CustDto dto) throws Exception {
            CustomerEntity custEntity = new CustomerEntity(dto.getCustID(),dto.getTitle(),dto.getName(),dto.getAddress(),dto.getTelNo());
            if(customerDao.add(custEntity)){
            return "Successfully Updated";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustDto dto) throws Exception {
        CustomerEntity custEntity = new CustomerEntity(dto.getCustID(),dto.getTitle(),dto.getName(),dto.getAddress(),dto.getTelNo());
        if(customerDao.update(custEntity)){
            return "Successfully Updated";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if(customerDao.delete(id)){
            return "Successfully Updated";
        }
        else{
            return "Fail";
        }
        
    }

    @Override
    public CustDto getCustomer(String id) throws Exception {
       CustomerEntity custEntity = customerDao.get(id);
       CustDto dto = new CustDto();
        if (custEntity != null){
            dto.setCustID(custEntity.getCustID());
            dto.setTitle(custEntity.getTitle());
            dto.setName(custEntity.getName());
            dto.setAddress(custEntity.getAddress());
            dto.setTelNo(custEntity.getTelNo());
        }
        return dto;
        
    }

    @Override
    public List<CustDto> getAll() throws Exception {
        List<CustDto> custDtos = new ArrayList<>();
        List<CustomerEntity> custEntities = customerDao.getAll();
        for (CustomerEntity entity : custEntities){
            custDtos.add(new CustDto(entity.getCustID(),entity.getTitle(),entity.getName(),entity.getAddress(),entity.getTelNo()));
        }
        return custDtos;
    }
    
}
