package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student implements Comparable<Student>{
    public static int count = 1;
    private String id;
    private String name;
    private String className;
    private String birth;
    private Double  gpa;

    public Student(){}

    public void solveName() {
        StringBuilder sb = new StringBuilder();
        String[] arr = name.trim().split("\\s+");
        for(String x : arr){
//            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
//            }
        }
        name = sb.toString().trim();
    }

    public void solveBirth()  {
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/')sb.insert(0,"0");
        if(sb.charAt(4) == '/')sb.insert(3, "0");
        birth = sb.toString();
    }


    public Student(String name, String className, String birth, Double gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", count++);
        this.name = name;
        solveName();
        this.className = className;
        this.birth = birth;
        solveBirth();
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", id, name, className, birth, gpa);
    }

    @Override
    public int compareTo(Student o) {
        if(gpa > o.gpa)return -1;
        else return 1;
    }
}
