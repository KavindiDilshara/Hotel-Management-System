package HotelManagement.service.custom.impl;

import HotelManagement.dao.custom.RoomDao;
import HotelManagement.dto.RoomsDto;
import HotelManagement.service.custom.RoomService;
import HotelManagement.dao.DaoFactory;
import HotelManagement.entity.RoomsEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindi
 */
public class RoomServiceImpl implements RoomService{

   private RoomDao roomDao = (RoomDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOMS);
    
    @Override
    public String addRoom(RoomsDto dto) throws Exception {
        RoomsEntity rmEntity = new RoomsEntity(dto.getRoomNo(),dto.getFlowNo(),dto.getCtgID());
        boolean resp = roomDao.add(rmEntity);
        if(resp){
            return "Sucessfuly Saved";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public String updateRoom(RoomsDto dto) throws Exception {
        RoomsEntity rmEntity = new RoomsEntity(dto.getRoomNo(),dto.getFlowNo(),dto.getCtgID());
        boolean resp = roomDao.update(rmEntity);
        if(resp){
            return "Sucessfuly Updated";
        }
        else{
            return "Fail";
        }}

    @Override
    public String deleteRoom(String id) throws Exception {

        if(roomDao.delete(id)){
            return "Sucessfuly Deleted";
        }
        else{
            return "Fail";
        }
    }

    @Override
    public RoomsDto getRoom(String id) throws Exception {
            RoomsEntity rmEntity = roomDao.get(id);
            RoomsDto rmDao = new RoomsDto();
            if(rmEntity != null){
                rmDao.setRoomNo(rmEntity.getRoomNo());
                rmDao.setFlowNo(rmEntity.getFlowNo());
                rmDao.setCtgID(rmEntity.getCtgID());
            }
            return rmDao;
    }

    @Override
    public List<RoomsDto> getAll() throws Exception {
       List<RoomsEntity> rmEntity = roomDao.getAll();
       List<RoomsDto> rmDaos = new ArrayList<>();
       for(RoomsEntity entity : rmEntity){
           rmDaos.add(new RoomsDto(entity.getRoomNo(),entity.getFlowNo(),entity.getCtgID()));
       }
       return rmDaos;
    }
    
    
    
}
