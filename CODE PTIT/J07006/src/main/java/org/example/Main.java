package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Integer x : arr)
        {
            if(m.containsKey(x))
            {
                m.put(x, m.get(x) + 1);
            }
            else m.put(x, 1);
        }

        for (Map.Entry<Integer, Integer> me : m.entrySet())
        {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
    }
}