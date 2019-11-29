package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Component;

import java.sql.SQLException;
import java.util.List;

public interface IComponentDao extends IBaseDao<Component,Integer> {
    List<Component> findByName(String cname) throws SQLException, Exception;
}
