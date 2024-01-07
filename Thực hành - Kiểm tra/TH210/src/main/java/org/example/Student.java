package org.example;

import java.util.Scanner;

public class Student
{
    private String id;
    private String name;
    private String grade;
    private String email;
    private String sdt;

    private String classN;
    private String tea;

    public Student(String id, String name, String grade, String email, String sdt, String classN, String tea) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.sdt = sdt;
        this.classN = classN;
        this.tea = tea;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getClassN() {
        return classN;
    }

    public void setClassN(String classN) {
        this.classN = classN;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        if(tea.length() > 0 && classN.length() > 0)
            return id + " " + name + " " + tea + " " + classN + " " + sdt + "\n";
        else return id + " " + name + " " + sdt + "\n";
    }
}
