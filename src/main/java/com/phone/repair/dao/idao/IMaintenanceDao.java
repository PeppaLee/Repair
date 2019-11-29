package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Maintenance;

public interface IMaintenanceDao {
    Maintenance login(String username,String password) throws Exception;
}
