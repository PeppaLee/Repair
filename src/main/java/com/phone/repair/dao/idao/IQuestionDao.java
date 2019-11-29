package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Question;

import java.util.List;

public interface IQuestionDao extends IBaseDao<Question,Integer> {
    List<Question> findByName(String qname) throws  Exception;
}
