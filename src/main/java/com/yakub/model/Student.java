package com.yakub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    private String sName;
    private String sMail;
    private String sAddress;

    public Student() {
    }

    public Student(int sId, String sName, String sMail, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.sMail = sMail;
        this.sAddress = sAddress;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsMail() {
        return sMail;
    }

    public void setsMail(String sMail) {
        this.sMail = sMail;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sMail='" + sMail + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}
