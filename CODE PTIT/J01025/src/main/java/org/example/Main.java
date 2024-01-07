package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            min1 = Math.min(min1, x);
            max1 = Math.max(max1, x);
            min2 = Math.min(min2, y);
            max2 = Math.max(max2, y);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
        }
        int a = Math.max(max1 - min1, max2 - min2);
        System.out.println(a * a);
    }
}