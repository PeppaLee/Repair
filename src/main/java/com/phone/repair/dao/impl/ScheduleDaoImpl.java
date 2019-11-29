package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IScheduleDao;
import com.phone.repair.dao.pojo.Record;
import com.phone.repair.dao.pojo.Schedule;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("scheduleDao")
public class ScheduleDaoImpl implements IScheduleDao {
    @Override
    public List<Schedule> findByName(String ename) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select recordid,empno,ename,repairschedule,expectresult,declares from schedule where ename like?";
        List<Schedule> scheduleList = qr.query(sql,new BeanListHandler<Schedule>(Schedule.class),"%"+ename+"%");
        return scheduleList;
    }

    @Override
    public Schedule findById(String recordid) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select recordid,empno,ename,repairschedule,expectresult,declares from schedule where recordid=?";
        Schedule schedule = qr.query(sql,new BeanHandler<Schedule>(Schedule.class),recordid);
        return schedule;
    }

    @Override
    public List<Schedule> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select * from schedule";
        List<Schedule> scheduleList = qr.query(sql,new BeanListHandler<Schedule>(Schedule.class));
        return scheduleList;
    }


    @Override
    public void save(Schedule schedule) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into schedule(recordid,empno,ename,repairschedule,expectresult,declares) values(?,?,?,?,?,?)";
        qr.update(sql,schedule.getRecordId(),schedule.getEmpno(),schedule.getEname(),schedule.getRepairSchedule(),schedule.getExpectResult(),schedule.getDeclares());

    }

    @Override
    public void update(Schedule schedule) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update schedule set empno=?,ename=?,repairschedule=?,expectresult=?,declares=? where recordid=?";
        qr.update(sql,schedule.getEmpno(),schedule.getEname(),schedule.getRepairSchedule(),schedule.getExpectResult(),schedule.getDeclares(),schedule.getRecordId());

    }

    @Override
    public void delete(Schedule schedule) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from schedule where recordid=?";
        qr.update(sql,schedule.getRecordId());
    }
    @Override
    public Schedule findById(Integer id) throws Exception {
        return null;
    }
}
