package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String msv;
    private String name;
    private String className;
    private String born;
    private double gpa;
    private List<Student> students;

    public Student(){}

    public Student(int msv,String name, String className, String born, double gpa)
    {
        this.msv = String.format("B20DCCN%03d", msv);
        this.name = name;
        this.className = className;
        this.born = born;
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return msv + " " + name + " " + className + " " + born + " " + String.format("%.2f", gpa) + "\n";
    }

    //    public void addStudent(Student student)
//    {
//        if(students.size() == 0) students = new ArrayList<Student>();
//        else students.add(student);
//    }
}
