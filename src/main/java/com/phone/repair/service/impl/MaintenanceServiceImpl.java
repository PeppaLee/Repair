package com.phone.repair.service.impl;

import com.phone.repair.dao.idao.IMaintenanceDao;
import com.phone.repair.dao.pojo.Maintenance;
import com.phone.repair.service.iservice.IMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("maintenanceService")
public class MaintenanceServiceImpl implements IMaintenanceService {
    @Autowired
    private IMaintenanceDao maintenanceDao;

    @Override
    public Maintenance login(String username, String password) {
        Maintenance maintenance = null;
        try {
            maintenance = maintenanceDao.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maintenance;
    }
}
