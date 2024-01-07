package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            String tmp = "";
            int sum = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if('0' <= s.charAt(i) && s.charAt(i) <= '9')
                {
                    sum += s.charAt(i) - '0';
                }
                else
                {
                    tmp += s.charAt(i);
                }
            }
//            System.out.println(tmp + sum);
//            System.out.println(sum);
            char[] arr = tmp.toCharArray();
            Arrays.sort(arr);
            tmp = String.valueOf(arr);
            System.out.println(tmp + sum);
        }
    }
}
//2
//AC2BEW3
//ACCBA10D2EW30