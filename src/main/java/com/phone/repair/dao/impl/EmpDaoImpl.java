package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IEmpDao;
import com.phone.repair.dao.pojo.Emp;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("empDao")
public class EmpDaoImpl implements IEmpDao {
    @Override
    public List<Emp> findByName(String ename) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,gender,grade,sal,hiredate,partid from emp where ename like?";
        List<Emp> empList = qr.query(sql,new BeanListHandler<Emp>(Emp.class),"%"+ename+"%");
        return empList;
    }

    @Override
    public List<Emp> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,gender,grade,sal,hiredate,partid from emp";
        List<Emp> empList = qr.query(sql,new BeanListHandler<Emp>(Emp.class));
        return empList;
    }

    @Override
    public Emp findById(Integer id) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select empno,ename,gender,grade,sal,hiredate,partid from emp where empno=?";
        Emp emp = qr.query(sql,new BeanHandler<Emp>(Emp.class),id);
        return emp;
    }

    @Override
    public void save(Emp emp) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into emp(ename,gender,grade,sal,hiredate,partid) values(?,?,?,?,?,?)";
        qr.update(sql,emp.getEname(),emp.getGender(),emp.getGrade(),emp.getSal(),emp.getHiredate(),emp.getPartid());
    }

    @Override
    public void update(Emp emp) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql="update emp set ename=?,gender=?,grade=?,sal=?,hiredate=?,partid=? where empno=?";
        qr.update(sql,emp.getEname(),emp.getGender(),emp.getGrade(),emp.getSal(),emp.getHiredate(),emp.getPartid(),emp.getEmpno());
    }

    @Override
    public void delete(Emp emp) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql="delete from emp where empno=?";
        qr.update(sql,emp.getEmpno());

    }
}
