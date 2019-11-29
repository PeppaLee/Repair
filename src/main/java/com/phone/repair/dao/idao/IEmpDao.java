package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Emp;

import java.util.List;

public interface IEmpDao extends IBaseDao<Emp,Integer> {
    List<Emp> findByName(String ename) throws Exception;
}
