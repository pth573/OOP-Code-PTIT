package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        Map<Integer, Integer> m1 = new TreeMap<>();
        Map<Integer, Integer> m2 = new TreeMap<>();
        for(Integer x : list1)
        {
            if(check(x))
            {
                if(m1.containsKey(x))
                {
                    m1.put(x, m1.get(x) + 1);
                }
                else m1.put(x, 1);
            }
        }
        for(Integer x : list2)
        {
            if(check(x))
            {
                if(m2.containsKey(x))
                {
                    m2.put(x, m2.get(x) + 1);
                }
                else m2.put(x, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : m1.entrySet())
        {
            Integer x = entry.getKey();
            if(m2.containsKey(x))
            {
                System.out.println(x + " " + m1.get(x) + " " + m2.get(x));
            }
        }

    }

    public static boolean check(int x)
    {
        if(x < 10) return false;
        String s = "" + x;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) < s.charAt(i + 1)) return false;
        }
        return true;
    }
}