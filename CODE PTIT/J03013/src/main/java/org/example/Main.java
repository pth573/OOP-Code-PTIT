package org.example;

import java.math.BigInteger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        sc.nextLine();
        while(t-- > 0)
        {
//            String x = sc.nextLine();
//            BigInteger big = new BigInteger(x);
            BigInteger x = new BigInteger(sc.next());
            BigInteger y = new BigInteger(sc.next());
            int n = Math.max(x.toString().length(), y.toString().length());
            BigInteger tmp = x.subtract(y);
            tmp = tmp.abs();
            String ans = tmp.toString();
            while(n - ans.length() > 0)
            {
                ans = "0" + ans;
            }
            System.out.println(ans);
        }
    }
}
//
//2
//978
//12977
//100
//100000

// ban dem ma