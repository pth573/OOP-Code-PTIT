package org.example;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException
    {
////        Scanner sc = new Scanner(new File("SV.in"));
//        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\J07010\\src\\main\\java\\org\\example\\SV.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        List<Student> list = new ArrayList<Student>();
//        for(int i = 1; i <= n; i++)
//        {
//            String name = sc.nextLine();
//            String className = sc.nextLine();
//            String born = sc.nextLine();
//            double gpa = Double.parseDouble(sc.nextLine());
//            Student student = new Student(i, name, className, born, gpa);
//            list.add(student);
//        }
//        for (Student x : list)
//        {
//            System.out.println(x);
//        }


//        Scanner sc = new Scanner(new File("SV.in"));
        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\J07010\\src\\main\\java\\org\\example\\SV.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> list = new ArrayList<Student>();
        for(int i = 1; i <= n; i++)
        {
            String name = sc.nextLine();
            String className = sc.nextLine();
            String born = sc.nextLine();
//            double gpa = Double.parseDouble(sc.nextLine());
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            Date formatStr = dateFormat.parse(born);
//            born = dateFormat.format(formatStr);

            double gpa = sc.nextDouble();
            sc.next();
//            sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date formatStr = dateFormat.parse(born);
            born = dateFormat.format(formatStr);
            Student student = new Student(i, name, className, born, gpa);
            list.add(student);
        }
        for (Student x : list)
        {
            System.out.print(x);
        }
    }
}