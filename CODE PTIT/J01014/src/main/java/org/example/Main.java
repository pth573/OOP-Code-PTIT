package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            long x;
            x = sc.nextLong();
            System.out.println(check(x));
        }
    }

    public static long check(long n)
    {
        long ans = 0;
        for(int i = 2; i <= (int)Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                while(n % i == 0)
                {
                    n /= i;
                    ans = i;
                }
            }
        }
        if(n > 1) ans = n;
        return ans;
    }
}