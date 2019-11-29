package com.phone.repair.service.impl;

import com.phone.repair.dao.idao.IAdminDao;
import com.phone.repair.dao.pojo.Admin;
import com.phone.repair.service.iservice.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private IAdminDao adminDao;

    @Override
    public Admin login(String username, String password) {
        Admin admin = null;
        try {
            admin = adminDao.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
}
