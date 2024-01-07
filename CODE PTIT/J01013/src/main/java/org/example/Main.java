package org.example;

import java.util.Scanner;




public class Main {
    static int[] a = new int[2000001];


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        prime();
//        for(int i = 0; i <= 2000000; i++)
//        {
//            System.out.print(a[i] + " ");
//        }
        for(int i = 0; i < n; i++)
        {
            int x;
            x = sc.nextInt();
            if(a[x] == 0) ans += x;
            else ans += check(x);
        }
        System.out.println(ans);
    }

    public static long check(int n)
    {
        long sum = 0;
        for(int i = 2; i <= (int)Math.sqrt(n); i++)
        {
            if(a[n] == 0)
            {
                sum += n;
                return sum;
            }
            else
            {
                if (n % i == 0)
                {
                    while(n % i == 0)
                    {
                        sum += i;
                        n /= i;
                    }
                }
            }
        }
        if(n > 1) sum += n;
        return sum;
    }

    public static void prime()
    {
        for(int i = 2; i <= 2000000; i++)
        {
            a[i] = 0;
        }
        a[0] = a[1] = 1;
        for(int i = 2; i <= (int)Math.sqrt(2000000); i++)
        {
            if(a[i] == 0)
            {
                for(int j = i * i; j <= 2000000; j += i)
                {
                    a[j] = 1;
                }
            }
        }
    }
}