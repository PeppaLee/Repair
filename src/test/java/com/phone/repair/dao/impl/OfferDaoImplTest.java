package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IOfferDao;
import com.phone.repair.dao.pojo.Offer;
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
public class OfferDaoImplTest {

    @Autowired
    private IOfferDao offerDao;
    @Test
    public void findByName() throws Exception {
        List<Offer> offerList = offerDao.findByName("存");
        offerList.forEach(System.out::println);
    }

    @Test
    public void findAll() throws Exception {
        List<Offer> offerList = offerDao.findAll();
        offerList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        Offer offer = offerDao.findById(1);
        System.err.println(offer);
    }

    @Test
    public void save() throws Exception {
        Offer offer = new Offer("aaa",new BigDecimal("200"));
        offerDao.save(offer);
        findAll();
    }

    @Test
    public void update() throws Exception {
        Offer offer = offerDao.findById(14);
        offer.setPartName("bbbb");
        offerDao.update(offer);
        findAll();
    }

    @Test
    public void delete() throws Exception {
        Offer offer = new Offer();
        offer.setPartId(14);
        offerDao.delete(offer);
        findAll();
    }
}