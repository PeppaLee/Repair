package com.phone.repair.dao.pojo;

import java.io.Serializable;

public class Question implements Serializable {
    private int qid;
    private String qname;
    private String description;
    private String answer;

    public Question(String qname, String description, String answer) {
        this.qname = qname;
        this.description = description;
        this.answer = answer;
    }

    public Question(int qid, String qname, String description, String answer) {
        this.qid = qid;
        this.qname = qname;
        this.description = description;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qid=" + qid +
                ", qname='" + qname + '\'' +
                ", description='" + description + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question(int qid, String description, String answer) {
        this.qid = qid;
        this.description = description;
        this.answer = answer;
    }

    public Question() {
    }
}
