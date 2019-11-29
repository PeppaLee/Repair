package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IMaintenanceDao;
import com.phone.repair.dao.pojo.Maintenance;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

@Repository("maintenanceDao")
public class MaintenanceDaoImpl implements IMaintenanceDao {
    @Override
    public Maintenance login(String username, String password) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,epassword from maintenance where ename=? and epassword=md5(?)";
        Maintenance maintenance = qr.query(sql,new BeanHandler<Maintenance>(Maintenance.class),username,password);
        return maintenance;
    }
}
