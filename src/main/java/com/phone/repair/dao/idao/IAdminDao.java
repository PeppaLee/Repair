package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Admin;

public interface IAdminDao {
    Admin login(String username, String password) throws Exception;
}
