package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++)
        {
            int x = in.readInt();
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