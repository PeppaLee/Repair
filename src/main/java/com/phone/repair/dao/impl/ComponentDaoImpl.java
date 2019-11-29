package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IComponentDao;
import com.phone.repair.dao.pojo.Component;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository("componentDao")
public class ComponentDaoImpl implements IComponentDao {

    @Override
    public List<Component> findByName(String cname) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select cid,cname,cprice,inventory from component where cname like?";
        List<Component> componentList = qr.query(sql,new BeanListHandler<Component>(Component.class),"%"+cname+"%");
        return componentList;
    }

    @Override
    public List<Component> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select cid,cname,cprice,inventory from component";
        List<Component> componentList = qr.query(sql,new BeanListHandler<Component>(Component.class));
        return componentList;
    }

    @Override
    public Component findById(Integer id) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select cid,cname,cprice,inventory from component where cid=?";
        Component component = qr.query(sql,new BeanHandler<Component>(Component.class),id);
        return component;
    }

    @Override
    public void save(Component component) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into component(cname,cprice,inventory) values(?,?,?)";
        qr.update(sql,component.getCname(),component.getCprice(),component.getInventory());

    }

    @Override
    public void update(Component component) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update component set cname=?,cprice=?,inventory=? where cid=?";
        qr.update(sql,component.getCname(),component.getCprice(),component.getInventory(),component.getCid());

    }

    @Override
    public void delete(Component component) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from component where cid=?";
        qr.update(sql,component.getCid());

    }
}
