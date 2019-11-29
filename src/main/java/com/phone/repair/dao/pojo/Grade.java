package com.phone.repair.dao.pojo;

import java.io.Serializable;

public class Grade implements Serializable {
    private int empno;
    private String ename;
    private int times;
    private int successTimes;
    private String grade;

    @Override
    public String toString() {
        return "Grade{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", times=" + times +
                ", successTimes=" + successTimes +
                ", grade='" + grade + '\'' +
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

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getSuccessTimes() {
        return successTimes;
    }

    public void setSuccessTimes(int successTimes) {
        this.successTimes = successTimes;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Grade(int empno, String ename, int times, int successTimes, String grade) {
        this.empno = empno;
        this.ename = ename;
        this.times = times;
        this.successTimes = successTimes;
        this.grade = grade;
    }

    public Grade() {
    }
}
