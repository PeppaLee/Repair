package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IRecordDao;
import com.phone.repair.dao.pojo.Record;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("recordDao")
public class RecordDaoImpl implements IRecordDao {
    @Override
    public List<Record> findByName(String ename) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select recordid,ename,empno,startdate,enddate,charge,result from record where ename like?";
        List<Record> recordList = qr.query(sql,new BeanListHandler<Record>(Record.class),"%"+ename+"%");
        return recordList;
    }

    @Override
    public Record findById(String recordid) throws Exception {
        QueryRunner qr= DBUtils.getQueryRunner();
        String sql = "select recordid,ename,empno,startdate,enddate,charge,result from record where recordid=?";
        Record record = qr.query(sql,new BeanHandler<Record>(Record.class),recordid);
        return record;
    }

    @Override
    public List<Record> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select recordid,empno,ename,startdate,enddate,charge,result from record";
        List<Record> recordList = qr.query(sql,new BeanListHandler<Record>(Record.class));
        return recordList;
    }

    @Override
    public Record findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public void save(Record record) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into record(recordid,ename,empno,startdate,enddate,charge,result) values(?,?,?,?,?,?)";
        qr.update(sql,record.getRecordId(),record.getEname(),record.getEmpno(),record.getStartDate(),record.getEndDate(),record.getCharge(),record.getResult());
    }

    @Override
    public void update(Record record) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update record set ename=?,empno=?,startdate=?,enddate=?,charge=?,result=? where recordid=?";
        qr.update(sql,record.getEname(),record.getEmpno(),record.getStartDate(),record.getEndDate(),record.getCharge(),record.getResult(),record.getRecordId());
    }

    @Override
    public void delete(Record record) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from record where recordid=?";
        qr.update(sql,record.getRecordId());
    }
}
