/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao;

import HotelManagement.dao.custom.DaoImpl.CategoryDaoImpl;
import HotelManagement.dao.custom.DaoImpl.CustomerDaoImpl;
import HotelManagement.dao.custom.DaoImpl.LoginDaoImpl;
import HotelManagement.dao.custom.DaoImpl.PackageDaoImpl;
import HotelManagement.dao.custom.DaoImpl.ReservationsDaoImpl;
import HotelManagement.dao.custom.DaoImpl.RoomsDaoImpl;

/**
 *
 * @author kavindi
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type) {
     
        switch (type) {
            case LOGIN:
                return new LoginDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case CATEGORY:
                return new CategoryDaoImpl();
            case PACKAGE:
                return new PackageDaoImpl();
            case ROOMS:
                return new RoomsDaoImpl();
            case RESEVATIONS:
                return new ReservationsDaoImpl();
            default:
                return null;
        }
    }
    
    
    public enum DaoTypes {
        LOGIN,CUSTOMER,CATEGORY,PACKAGE,ROOMS,RESEVATIONS;
    }
}
