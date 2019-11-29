package com.phone.repair.service.iservice;

import com.phone.repair.dao.pojo.Admin;

public interface IAdminService {
    Admin login(String username, String password);
}
