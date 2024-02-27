/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dao.custom.DaoImpl;

import HotelManagement.dao.CrudUtil;
import HotelManagement.dao.custom.PackageDao;
import HotelManagement.entity.PackageEntity;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author kavindi
 */
public class PackageDaoImpl implements PackageDao{

    @Override
    public boolean add(PackageEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO packages VALUES(?,?,?)",
                t.getPacId(),
                t.getPacType(),
                t.getPrice());
    }

    @Override
    public boolean update(PackageEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE packages SET PackageType=?,Price=? WHERE PackageID=?",
                t.getPacType(),
                t.getPrice(),
                t.getPacId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM packages WHERE PackageID=?", id);
    }

    @Override
    public PackageEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM packages WHERE PackageID =?",id);
        PackageEntity packEntity = new PackageEntity();
        while(rst.next()){
                packEntity.setPacId(rst.getString("PackageID"));
                packEntity.setPacType(rst.getString("PackageType"));
                packEntity.setPrice(rst.getDouble("Price"));
        }
        return packEntity;
    }

    @Override
    public List<PackageEntity> getAll() throws Exception {
       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM packages");
        List<PackageEntity> packEntities = new ArrayList<>();
        while(rst.next()){
            packEntities.add(new PackageEntity(
                    rst.getString("PackageID"),
                    rst.getString("PackageType"),
                    rst.getDouble("Price")));
        }
        return packEntities;
    }
    
}
