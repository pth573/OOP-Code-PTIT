package org.example;

import java.util.Scanner;

public class Student
{
    private String id;
    private String name;
    private String grade;
    private String email;
    private String sdt;

    public Student(String id, String name, String grade, String email, String sdt) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.sdt = sdt;
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

    @Override
    public String toString() {
        return id + " " + name + " " + grade + " " + email + " " + sdt + "\n";
    }
}
