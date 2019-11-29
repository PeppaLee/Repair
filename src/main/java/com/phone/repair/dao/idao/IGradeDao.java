package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Grade;

import java.util.List;

public interface IGradeDao extends IBaseDao<Grade,Integer> {
    List<Grade> findByName(String ename) throws Exception;
}
