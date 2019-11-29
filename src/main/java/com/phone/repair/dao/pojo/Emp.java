package com.phone.repair.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Emp implements Serializable {
    private int empno;
    private String ename;
    private String gender;
    private String grade;
    private BigDecimal sal;
    private Date hiredate;
    private int partid;

    public Emp(String ename, String gender, String grade, BigDecimal sal, Date hiredate, int partid) {
        this.ename = ename;
        this.gender = gender;
        this.grade = grade;
        this.sal = sal;
        this.hiredate = hiredate;
        this.partid = partid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", sal=" + sal +
                ", hiredate='" + hiredate + '\'' +
                ", partid=" + partid +
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public Emp(int empno, String ename, String gender, String grade, BigDecimal sal, Date hiredate, int partid) {
        this.empno = empno;
        this.ename = ename;
        this.gender = gender;
        this.grade = grade;
        this.sal = sal;
        this.hiredate = hiredate;
        this.partid = partid;
    }

    public Emp() {
    }
}
