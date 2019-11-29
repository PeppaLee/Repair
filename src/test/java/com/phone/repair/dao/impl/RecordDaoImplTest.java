package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IRecordDao;
import com.phone.repair.dao.pojo.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RecordDaoImplTest {

    @Autowired
    IRecordDao recordDao;
    @Test
    public void findByName() throws Exception {
        List<Record> recordList = recordDao.findByName("王");
        recordList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Record> recordList = recordDao.findAll();
        recordList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Record record = recordDao.findById("S10007");
        System.out.println(record);
    }

    @Test
    public void save() throws Exception {
        Record record = new Record("F10004",1008,"aaa",new Date(),new Date(),new BigDecimal("200"),"success");
        recordDao.save(record);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Record record = recordDao.findById("F10004");
        record.setEname("@@@@");
        recordDao.update(record);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Record record =new Record();
        record.setRecordId("F10004");
        recordDao.delete(record);
        findAll();
    }

}