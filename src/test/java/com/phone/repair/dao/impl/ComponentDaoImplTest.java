package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IComponentDao;
import com.phone.repair.dao.pojo.Component;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ComponentDaoImplTest {

    @Autowired
    IComponentDao componentDao;
    @Test
    public void findByName() throws Exception {
        List<Component> componentList = componentDao.findByName("手");
        componentList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Component> componentList = componentDao.findAll();
        componentList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Component component = componentDao.findById(9);
        System.err.println(component);
    }

    @Test
    public void save() throws Exception {
        Component component = new Component("aaa",new BigDecimal("200"),20);
        componentDao.save(component);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Component component = componentDao.findById(10);
        component.setCname("bbbbb");
        componentDao.update(component);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Component component = new Component();
        component.setCid(10);
        componentDao.delete(component);
        findAll();
    }
}