package com.phone.repair.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Record implements Serializable {
    private String recordId;
    private int empno;
    private String ename;
    private Date startDate;
    private Date endDate;
    private BigDecimal charge;
    private String result;

    @Override
    public String toString() {
        return "Record{" +
                "recordId='" + recordId + '\'' +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", charge=" + charge +
                ", result='" + result + '\'' +
                '}';
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Record(String recordId, int empno, String ename, Date startDate, Date endDate, BigDecimal charge, String result) {
        this.recordId = recordId;
        this.empno = empno;
        this.ename = ename;
        this.startDate = startDate;
        this.endDate = endDate;
        this.charge = charge;
        this.result = result;
    }

    public Record() {
    }
}
