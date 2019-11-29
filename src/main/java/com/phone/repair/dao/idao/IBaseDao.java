package com.phone.repair.dao.idao;

import java.util.List;

public interface IBaseDao<T, K> {
    List<T> findAll() throws Exception;

    T findById(K id) throws Exception;

//    List<T> findByPage(int page, int size) throws Exception;

    void save(T t) throws Exception;

    void update(T t) throws Exception;

    void delete(T t) throws Exception;
}
