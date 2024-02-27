/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.service;

import HotelManagement.service.custom.impl.CetagoryServiceImpl;
import HotelManagement.service.custom.impl.CustomerServiceImpl;
import HotelManagement.service.custom.impl.PackageServiceImpl;
import HotelManagement.service.custom.impl.ReservationsServiceImpl;
import HotelManagement.service.custom.impl.RoomServiceImpl;
import HotelManagement.service.custom.impl.UserServiceImpl;

/**
 *
 * @author kavindi
 */
public class ServiceFactory {
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    public static ServiceFactory getInstance() {
      if (serviceFactory == null) {
        serviceFactory = new ServiceFactory();
         }
    return serviceFactory;
    }
    
    public  SuperService getService(ServiceType serviceType){
    
        switch (serviceType) {
            case LOGIN:
                return new UserServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case CATEGORY:
                return new CetagoryServiceImpl();
            case PACKAGE:
                return new PackageServiceImpl();
            case ROOMS:
                return new RoomServiceImpl();
            case RESEVATIONS:
                return new ReservationsServiceImpl();
            default:
                return null;
        }
    
    }
    
    
    public enum ServiceType{
        LOGIN,CUSTOMER,CATEGORY,PACKAGE,ROOMS,RESEVATIONS;
    }
    
}
