package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(s.length() > 1)
        {
            int n = s.length() / 2;
            String x = s.substring(0, n);
            String y = s.substring(n);
//            System.out.println(x + " " + y);
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger c = a.add(b);
            System.out.println(c);
            s = c.toString();
        }
//        System.out.println(s);
    }
}