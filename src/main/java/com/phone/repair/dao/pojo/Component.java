package com.phone.repair.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Component implements Serializable {
    private int cid;
    private String cname;
    private BigDecimal cprice;
    private int inventory;

    public Component(String cname, BigDecimal cprice, int inventory) {
        this.cname = cname;
        this.cprice = cprice;
        this.inventory = inventory;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public BigDecimal getCprice() {
        return cprice;
    }

    public void setCprice(BigDecimal cprice) {
        this.cprice = cprice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Component(int cid, String cname, BigDecimal cprice, int inventory) {
        this.cid = cid;
        this.cname = cname;
        this.cprice = cprice;
        this.inventory = inventory;
    }

    public Component() {
    }

    @Override
    public String toString() {
        return "Component{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cprice=" + cprice +
                ", inventory=" + inventory +
                '}';
    }
}
