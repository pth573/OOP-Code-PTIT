package org.example;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        while(n-- > 0){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(Student x : arr){
            System.out.println(x);
        }
    }
}

//2
//ngUYen   Van    NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen    QuanG   hAi
//D20DCCN02-B
//1/9/1994
//3.0
