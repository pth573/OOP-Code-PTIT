package org.example;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static boolean snt(Integer x)
//    {
//        for(int i = 2; i <= (int)Math.sqrt(x); i++)
//        {
//            if(x % i == 0) return false;
//        }
//        return x > 1;
//    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
//        DataInputStream in = new DataInputStream(new FileInputStream("SONGUYEN.in"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for(Integer x : list)
        {
            if(snt(x))
            {
                if(!m.containsKey(x))
                {
                    m.
                    m.put(x, 1);
                }
                else
                {
                    m.put(x, m.get(x) + 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> se : m.entrySet())
        {
            System.out.println(se.getKey() + " " + se.getValue());
        }
    }

    public static boolean snt(Integer x)
    {
        for(int i = 2; i <= (int)Math.sqrt(x); i++)
        {
            if(x % i == 0) return false;
        }
        return x > 1;
    }
}