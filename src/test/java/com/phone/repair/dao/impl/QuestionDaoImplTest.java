package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IQuestionDao;
import com.phone.repair.dao.pojo.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class QuestionDaoImplTest {

    @Autowired
    IQuestionDao questionDao;
    @Test
    public void findByName() throws Exception {
        List<Question> questionList = questionDao.findByName("问题");
        questionList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Question> questionList = questionDao.findAll();
        questionList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Question question = questionDao.findById(1);
        System.err.println(question);
    }

    @Test
    public void save() throws Exception {
        Question question = new Question("AAA","BBB","CCC");
        questionDao.save(question);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Question question = questionDao.findById(6);
        question.setQname("@@@@@");
        questionDao.update(question);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Question question = new Question();
        question.setQid(6);
        questionDao.delete(question);
        findAll();
    }
}