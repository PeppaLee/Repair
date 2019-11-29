package com.phone.repair.dao.pojo;

import java.io.Serializable;

public class Schedule implements Serializable {
    private String recordId;
    private int empno;
    private String ename;
    private String repairSchedule;
    private String expectResult;
    private String declares;

    @Override
    public String toString() {
        return "Schedule{" +
                "recordId='" + recordId + '\'' +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                ", repairSchedule='" + repairSchedule + '\'' +
                ", expectResult='" + expectResult + '\'' +
                ", declares='" + declares + '\'' +
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

    public String getRepairSchedule() {
        return repairSchedule;
    }

    public void setRepairSchedule(String repairSchedule) {
        this.repairSchedule = repairSchedule;
    }

    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public String getDeclares() {
        return declares;
    }

    public void setDeclares(String declares) {
        this.declares = declares;
    }

    public Schedule(String recordId, int empno, String ename, String repairSchedule, String expectResult, String declares) {
        this.recordId = recordId;
        this.empno = empno;
        this.ename = ename;
        this.repairSchedule = repairSchedule;
        this.expectResult = expectResult;
        this.declares = declares;
    }

    public Schedule() {
    }
}
