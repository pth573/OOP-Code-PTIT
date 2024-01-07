package org.example;

public class Time {
    String gv;
    String mon;
    Double gpa;

    public Time(String gv, String mon, Double gpa) {
        this.gv = gv;
        this.mon = mon;
        this.gpa = gpa;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Time{" +
                "gv='" + gv + '\'' +
                ", mon='" + mon + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
