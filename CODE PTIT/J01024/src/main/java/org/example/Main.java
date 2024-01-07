package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String x = sc.next();
            if(check(x))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    public static boolean check(String x)
    {
        for(int i = 0; i < x.length(); i++)
        {
            char tmp = x.charAt(i);
            if(tmp != '0' && tmp != '1' && tmp != '2') return false;
        }
        return true;
    }
}