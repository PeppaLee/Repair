package com.phone.repair.service.iservice;

import com.phone.repair.dao.pojo.Maintenance;

public interface IMaintenanceService {
    Maintenance login(String username,String password );
}
