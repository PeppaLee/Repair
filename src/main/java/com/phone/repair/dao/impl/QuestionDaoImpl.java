package com.phone.repair.dao.impl;

import com.phone.repair.dao.idao.IQuestionDao;
import com.phone.repair.dao.pojo.Question;
import com.phone.repair.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("questionDao")
public class QuestionDaoImpl implements IQuestionDao {

    @Override
    public List<Question> findByName(String qname) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select qid,qname,description,answer from question where qname like?";
        List<Question> questionList = qr.query(sql, new BeanListHandler<Question>(Question.class), "%" + qname + "%");
        return questionList;
    }

    @Override
    public List<Question> findAll() throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select qid,qname,description,answer from question";
        List<Question> questionList = qr.query(sql, new BeanListHandler<Question>(Question.class));
        return questionList;
    }

    @Override
    public Question findById(Integer id) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select qid,qname,description,answer from question where qid=?";
        Question question = qr.query(sql, new BeanHandler<Question>(Question.class), id);
        return question;
    }

    @Override
    public void save(Question question) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "insert into question(qname,description,answer) values(?,?,?)";
        qr.update(sql, question.getQname(), question.getDescription(), question.getAnswer());

    }

    @Override
    public void update(Question question) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "update question set qname=?,description=?,answer=? where qid=?";
        qr.update(sql, question.getQname(), question.getDescription(), question.getAnswer(), question.getQid());
    }

    @Override
    public void delete(Question question) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "delete from question where qid=?";
        qr.update(sql, question.getQid());
    }
}
