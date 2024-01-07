package org.example;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        while(sc.hasNextInt())
        {
            int x = sc.nextInt();
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