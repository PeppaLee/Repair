package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IEmpDao;
import com.phone.repair.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpDaoImplTest {
    @Autowired
    private IEmpDao empDao;
    @Test
    public void findByName() throws Exception {
        List<Emp> empList = empDao.findByName("李");
        empList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Emp> empList = empDao.findAll();
        empList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Emp emp = empDao.findById(1002);
        System.err.println(emp);
    }

    @Test
    public void save() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm");
        Emp emp = new Emp("韩吴","男","B",new BigDecimal("5000"),sdf.parse("2019-11-27"),4);
        empDao.save(emp);
        findAll();
    }

    @Test
    public void update() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm");
        Emp emp = empDao.findById(1013);
        emp.setEname("hahaha");
        emp.setGender("aaa");
        emp.setGrade("A");
        emp.setSal(new BigDecimal("200"));
        emp.setHiredate(sdf.parse("2019-02-13"));
        emp.setPartid(1);
        empDao.update(emp);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Emp emp = new Emp();
        emp.setEmpno(1014);
        empDao.delete(emp);
        findAll();
    }
}