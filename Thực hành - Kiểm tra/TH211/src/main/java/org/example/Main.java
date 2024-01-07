package org.example;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        List<Product> li = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int sell = Integer.parseInt(sc.nextLine());
            String date = sc.nextLine();
            li.add()
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++)
        {
            String name = sc2.nextLine();
            String[] x = name.split("\\s+");
            String a = "";
            for(int j = 0; j < x.length - 1; j++)
            {
                a += x[j] + " ";
            }
            a = a.substring(0, a.length() - 1);
            int m = Integer.parseInt(x[x.length - 1]);
            for(int h = 0; h < m; h++)
            {
                String nameClass = sc2.nextLine();
                String[] tmp2 = nameClass.split("\\s+");
                String b = tmp2[0];
                String c = "";
                for(int k = 1; k < tmp2.length; k++)
                {
                    c += tmp2[k] + " ";
                }
//                System.out.println(a + " " + b + " " + c + "\n");
                c = c.substring(0, c.length() - 1);
                for(Student student : li)
                {
                    if(b.equals(student.getId()))
                    {
                        student.setClassN(c);
                        student.setTea(a);
                    }
                }
            }
        }

        Collections.sort(li, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getId().compareTo(b.getId());
            }
        });
        for (Student x : li)
        {
            System.out.print(x);
        }
    }
}