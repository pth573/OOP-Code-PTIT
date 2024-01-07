package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0)
        {
            String[] words = sc.nextLine().split(" ");
           // StringBuilder sb = new StringBuilder();
            String[] tmp = new String[1000];
            int j = 0;
            for(String x : words)
            {
                if(!x.isEmpty())
                {
                    tmp[j] = x;
                    j++;
                }
            }

            String ans = "";
            int len = j;
            for(int i = 1; i < len; i++)
            {
                if(!tmp[i].isEmpty())
                {
                    if(i < len - 1) ans += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
                    else ans += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + ", ";
                }
            }
            ans += tmp[0].toUpperCase();
            System.out.println(ans);
        }
    }
}
//4
//        nGUYEn    quaNG   vInH
//        tRan   thi THU    huOnG
//        nGO   quoC  VINH
//        lE            tuAn    aNH