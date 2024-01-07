package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] a = new int[n][n];
//            List<Pair<Integer, Integer>> list = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    int x = sc.nextInt();
                    if(x == 1)
                    {
                        if(i < j)
                        {
                            Pair<Integer, Integer> p = new Pair<>(i + 1, j + 1);
//                            list.add(p);
                            System.out.println(p);
                        }
                    }
                }
            }
//            for (Pair x : list)
//            {
//                System.out.println(x);
//            }
        }
}