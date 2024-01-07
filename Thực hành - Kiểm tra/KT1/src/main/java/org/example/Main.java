package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("MATRIX.in"));
        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\KT1\\src\\main\\java\\org\\example\\MATRIX.in"));
        while (sc.hasNext())
        {
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                int[][] arr= new int[m][n];
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < m; j++)
                    {
                        arr[j][i] = sc.nextInt();
                    }
                }
                Arrays.sort(arr[k - 1]);
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < m; j++)
                    {
                        System.out.print(arr[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}