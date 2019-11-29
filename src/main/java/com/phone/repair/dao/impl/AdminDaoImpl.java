package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IAdminDao;
import com.phone.repair.dao.pojo.Admin;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

@Repository("adminDao")
public class AdminDaoImpl implements IAdminDao {
    @Override
    public Admin login(String username, String password) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select aid,aname,apassword from admin where aname=? and apassword=md5(?)";
        Admin admin = qr.query(sql, new BeanHandler<Admin>(Admin.class), username, password);
        return admin;
    }
}
