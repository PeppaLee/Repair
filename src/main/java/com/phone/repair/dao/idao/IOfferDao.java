package com.phone.repair.dao.idao;

import com.phone.repair.dao.pojo.Offer;

import java.util.List;

public interface IOfferDao extends IBaseDao<Offer,Integer> {
    List<Offer> findByName(String partName) throws Exception;
}
