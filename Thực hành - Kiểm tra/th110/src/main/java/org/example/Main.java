package org.example;

import java.io.*;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();
        Set<String> se1 = new TreeSet<String>();
        Set<Integer> se2 = new TreeSet<Integer>();
        for(String x : a)
        {
            se1.add(x);
        }
        for (Integer x : a2)
        {
            se2.add(x);
        }
        Set<String> se3 = new TreeSet<String>();
        for(String x : se1)
        {
//            String tmp = "";
            for(Integer y : se2)
            {
                String tmp = "";
                tmp += x + y.toString();
                se3.add(tmp);
            }
        }
        for(String x : se3) System.out.println(x);
    }
}