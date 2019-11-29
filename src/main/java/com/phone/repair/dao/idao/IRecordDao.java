package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Record;

import java.util.List;

public interface IRecordDao extends IBaseDao<Record,Integer> {
    List<Record> findByName(String ename) throws Exception;
    Record findById(String recordid) throws  Exception;
}
