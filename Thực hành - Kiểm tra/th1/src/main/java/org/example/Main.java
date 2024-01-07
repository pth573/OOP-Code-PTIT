package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            int[] arr = new int[10001];
            for(int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                arr[x] = 0;
                list.add(x);
            }
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer t1, Integer t2) {
                    return t1 - t2;
                }
            });
            for(int x : list)
            {
                if(x % 2 == 0 && arr[x] == 0)
                {
                    System.out.print(x + " ");
                    arr[x] = 1;
                }
            }
            System.out.println();
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer t1, Integer t2) {
                    return t2 - t1;
                }
            });
            for(int x : list)
            {
                if(x % 2 == 1 && arr[x] == 0)
                {
                    System.out.print(x + " ");
                    arr[x] = 1;
                }
            }
            System.out.println();
        }
    }
}