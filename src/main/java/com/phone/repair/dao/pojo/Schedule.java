package com.phone.repair.dao.pojo;

import java.io.Serializable;

public class Schedule implements Serializable {
    private String recordId;
    private int empno;
    private String repairSchedule;
    private String expectResult;
    private String declare;

    @Override
    public String toString() {
        return "Schedule{" +
                "recordId='" + recordId + '\'' +
                ", empno=" + empno +
                ", repairSchedule='" + repairSchedule + '\'' +
                ", expectResult='" + expectResult + '\'' +
                ", declare='" + declare + '\'' +
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

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
    }

    public Schedule(String recordId, int empno, String repairSchedule, String expectResult, String declare) {
        this.recordId = recordId;
        this.empno = empno;
        this.repairSchedule = repairSchedule;
        this.expectResult = expectResult;
        this.declare = declare;
    }

    public Schedule() {
    }
}
