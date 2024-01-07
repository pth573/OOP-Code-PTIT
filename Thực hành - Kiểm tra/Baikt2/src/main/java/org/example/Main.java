package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> arr1 = (ArrayList<String>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        TreeSet<String> set = new TreeSet<>();
        for(String x : arr1){
            for(Integer y : arr2){
                set.add(x + y);
            }
        }
        for (String x : set){
            System.out.println(x);
        }
    }
}