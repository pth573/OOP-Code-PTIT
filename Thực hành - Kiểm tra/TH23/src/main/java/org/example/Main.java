package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(int j = arr.length - 1; j >= 0; j--)
            {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
//            StringBuilder sb = new StringBuilder(s);
//            sb.reverse();
//            System.out.println(sb.toString());
        }
    }
}

//2
//I like this program very much
//much very program this like I