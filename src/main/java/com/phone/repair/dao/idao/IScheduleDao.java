package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Record;
import com.phone.repair.dao.pojo.Schedule;

import java.util.List;

public interface IScheduleDao extends IBaseDao<Schedule,Integer> {
    List<Schedule> findByName(String ename) throws Exception;
    Schedule findById(String recordid) throws  Exception;
}
