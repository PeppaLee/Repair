package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IGradeDao;
import com.phone.repair.dao.pojo.Grade;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gradeDao")
public class GradeDaoImpl implements IGradeDao {
    @Override
    public List<Grade> findByName(String ename) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,times,successtimes,grade from grade where ename like?";
        List<Grade> gradeList = qr.query(sql,new BeanListHandler<Grade>(Grade.class),"%"+ename+"%");
        return gradeList;
    }

    @Override
    public List<Grade> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,times,successtimes,grade from grade";
        List<Grade> gradeList = qr.query(sql,new BeanListHandler<Grade>(Grade.class));
        return gradeList;
    }

    @Override
    public Grade findById(Integer id) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,times,successtimes,grade from grade where empno=?";
        Grade grade = qr.query(sql,new BeanHandler<Grade>(Grade.class),id);
        return grade;
    }

    @Override
    public void save(Grade grade) throws Exception {
    QueryRunner qr = DBUtils.getQueryRunner();
    String sql = "insert into grade(empno,ename,times,successtimes,grade) values(?,?,?,?,?)";
    qr.update(sql,grade.getEmpno(),grade.getEname(),grade.getTimes(),grade.getSuccessTimes(),grade.getGrade());
    }

    @Override
    public void update(Grade grade) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update grade set ename=?,times=?,successtimes=?,grade=? where empno=?";
        qr.update(sql,grade.getEname(),grade.getTimes(),grade.getSuccessTimes(),grade.getGrade(),grade.getEmpno());

    }

    @Override
    public void delete(Grade grade) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from grade where empno=?";
        qr.update(sql,grade.getEmpno());

    }
}
