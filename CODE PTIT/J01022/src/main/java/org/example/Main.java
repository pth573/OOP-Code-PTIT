package org.example;

import java.util.Scanner;

public class Main {
    static long[] x = new long[94];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        init();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            int ans = solve(n , k);
            System.out.println(ans);
        }
    }

    public static void init()
    {
        x[1] = 1;
        x[2] = 1;
        for(int i = 3; i <= 93; i++)
        {
            x[i] =  x[i - 2] + x[i - 1];
        }
    }

    public static int solve(long n, long k)
    {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= x[(int)(n - 2)]) return solve(n - 2, k);
        else return solve(n - 1, k - x[(int)(n - 2)]);
    }
}