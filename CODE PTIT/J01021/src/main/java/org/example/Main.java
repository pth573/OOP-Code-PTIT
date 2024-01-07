package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) return;
            System.out.println(solve(a, b));
        }
    }
    public static long solve(long a, long b)
    {
        long tmp = a;
        long ans = 1;
        int mod = 1000000007;
        while(b != 0)
        {
            if(b % 2 == 1)
            {
                ans = (ans % mod) * (tmp % mod);
                ans %= mod;
            }
            tmp *= tmp;
            tmp %= mod;
            b /= 2;
        }
        return ans;
    }
}