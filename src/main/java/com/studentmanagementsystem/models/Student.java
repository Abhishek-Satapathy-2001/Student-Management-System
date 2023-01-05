package com.studentmanagementsystem.models;

public class Student {
    private String name;
    private int rollNo;
    private long regdNo;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public long getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(long regdNo) {
        this.regdNo = regdNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
