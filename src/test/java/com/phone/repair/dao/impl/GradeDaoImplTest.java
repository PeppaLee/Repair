package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IGradeDao;
import com.phone.repair.dao.pojo.Grade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class GradeDaoImplTest {

    @Autowired
    private IGradeDao gradeDao;
    @Test
    public void findByName() throws Exception {
        List<Grade> gradeList = gradeDao.findByName("李");
        gradeList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Grade> gradeList = gradeDao.findAll();
        gradeList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Grade grade = gradeDao.findById(1004);
        System.err.println(grade);
    }

    @Test
    public void save() throws Exception {
        Grade grade = new Grade(1014,"aaa",200,150,"A");
        gradeDao.save(grade);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Grade grade = gradeDao.findById(1014);
        grade.setEname("bbbb");
        gradeDao.update(grade);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Grade grade = new Grade();
        grade.setEmpno(1014);
        gradeDao.delete(grade);
        findAll();
    }
}