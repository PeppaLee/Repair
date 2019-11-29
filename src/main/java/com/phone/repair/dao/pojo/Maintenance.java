package com.phone.repair.dao.pojo;

import java.io.Serializable;

public class Maintenance implements Serializable {
    private int empno;
    private String ename;
    private String epassword;

    @Override
    public String toString() {
        return "Maintenance{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", epassword='" + epassword + '\'' +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public Maintenance(int empno, String ename, String epassword) {
        this.empno = empno;
        this.ename = ename;
        this.epassword = epassword;
    }

    public Maintenance() {
    }
}
