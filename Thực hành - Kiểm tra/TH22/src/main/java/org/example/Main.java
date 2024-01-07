package org.example;

import java.math.BigInteger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger x = new BigInteger(s);
        while(x.toString().length() > 1)
        {
            String tmp = x.toString();
            int n = tmp.length();
            String a = tmp.substring(0, (int)(n/2));
            String b = tmp.substring((int)(n/2), n);
//            System.out.println(a + " " + b);
            BigInteger k = new BigInteger(a);
            BigInteger h = new BigInteger(b);
            x = k.add(h);
            System.out.println(x.toString());
        }
    }
}