package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IOfferDao;
import com.phone.repair.dao.pojo.Offer;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("offerDao")
public class OfferDaoImpl implements IOfferDao {
    @Override
    public List<Offer> findByName(String partName) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select partid,partname,offerprice from offer where partname like?";
        List<Offer> offerList = qr.query(sql, new BeanListHandler<Offer>(Offer.class), "%" + partName + "%");
        return offerList;
    }

    @Override
    public List<Offer> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select partid,partname,offerprice from offer";
        List<Offer> offerList = qr.query(sql, new BeanListHandler<Offer>(Offer.class));
        return offerList;
    }

    @Override
    public Offer findById(Integer id) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select partid,partname,offerprice from offer where partid=?";
        Offer offer = qr.query(sql, new BeanHandler<Offer>(Offer.class), id);
        return offer;
    }

    @Override
    public void save(Offer offer) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into offer(partid,partname,offerprice) values(?,?,?)";
        qr.update(sql, offer.getPartId(), offer.getPartName(), offer.getOfferPrice());
    }

    @Override
    public void update(Offer offer) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update offer set partname=?,offerprice=? where partid=?";
        qr.update(sql, offer.getPartName(), offer.getOfferPrice(), offer.getPartId());
    }

    @Override
    public void delete(Offer offer) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from offer where partid=?";
        qr.update(sql, offer.getPartId());
    }
}
