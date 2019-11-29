package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IScheduleDao;
import com.phone.repair.dao.pojo.Schedule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ScheduleDaoImplTest {

    @Autowired
    IScheduleDao scheduleDao;

    @Test
    public void findByName() throws Exception {
        List<Schedule> scheduleList = scheduleDao.findByName("王");
        scheduleList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Schedule schedule = scheduleDao.findById("F10003");
        System.err.println(schedule);
    }

    @Test
    public void findAll() throws Exception {
        List<Schedule> scheduleList = scheduleDao.findAll();
        scheduleList.forEach(System.out::println);
    }

    @Test
    public void save() throws Exception {
        Schedule schedule = new Schedule("F1002",1005,"王猩猩","20%","成功","aa");
        scheduleDao.save(schedule);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Schedule schedule = scheduleDao.findById("F1002");
        schedule.setEname("aaaaa");
        scheduleDao.update(schedule);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Schedule schedule = new Schedule();
        schedule.setRecordId("F1002");
        scheduleDao.delete(schedule);
        findAll();
    }
}