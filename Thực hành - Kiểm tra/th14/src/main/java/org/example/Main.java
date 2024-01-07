package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    static int[] arr = new int[2000001];
    static int[] check = new int[2000001];

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        for(int i = 0; i <= 2000000; i++)
        {
            arr[i] = 0;
            check[i] = 0;
        }
        sang();
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        Set<Integer> se = new TreeSet<Integer>();
        for(int x : list)
        {
            if(arr[x] == 0 && check[x] == 0 && x >= 100)
            {
                se.add(x);
                check[x] = 1;
            }
        }
        for (Integer x : se)
        {
            System.out.println(x);
        }
    }

    public static void sang()
    {
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= (int)Math.sqrt(2000001); i++)
        {
            if(arr[i] == 0)
            {
                for(int j = i * i; j <= 2000001; j += i)
                {
                    arr[j] = 1;
                }
            }
        }
    }
}