package org.example;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Student> li = new ArrayList<>();
        while(sc.hasNextLine())
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            sdt = "0" + sdt;
            li.add(new Student(id, name, grade, email, sdt));
        }
        Collections.sort(li, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.getGrade().compareTo(b.getGrade()) == 0)
                {
                    return a.getId().compareTo(b.getId());
                }
                else return a.getGrade().compareTo(b.getGrade());
            }
        });
        for (Student x : li)
        {
            System.out.print(x);
        }
    }
}