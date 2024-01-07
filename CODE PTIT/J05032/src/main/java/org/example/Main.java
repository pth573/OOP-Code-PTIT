package org.example;

import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<People> li = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String name = sc.next();
            String born = sc.next();
            String[] arr = born.split("/");
            li.add(new People(name, arr[2], arr[1], arr[0]));
        }
        Comparator<People> peopleCollector = (p1, p2) -> {
               int x = Integer.compare(Integer.parseInt(p1.getY()), Integer.parseInt(p2.getY()));
               if(x != 0) return x;
               else
               {
                   int y = Integer.compare(Integer.parseInt(p1.getM()), Integer.parseInt(p2.getM()));
                   if(y != 0) return y;
                   else
                   {
                       int z = Integer.compare(Integer.parseInt(p1.getD()), Integer.parseInt(p2.getD()));
                       return z;
                   }
               }
        };
        People minPeople = Collections.min(li, peopleCollector);
        People maxPeople = Collections.max(li, peopleCollector);
        System.out.println(maxPeople.getName());
        System.out.println(minPeople.getName());

    }
}

//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990