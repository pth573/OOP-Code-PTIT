package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Product> li = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            sc.nextLine();
            String id = "MH" + String.format("%02d", i);
            String name = sc.nextLine();
            String group = sc.nextLine();
            double buy = sc.nextDouble();
            double sell = sc.nextDouble();
            li.add(new Product(id, name, group, buy, sell));
//            sc.next();
        }
        Collections.sort(li, new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                double x = a.getSell() - a.getBuy();
                double y = b.getSell() - b.getBuy();
                if(x > y) return -1;
                else return 1;
            }
        });
        for(Product x : li)
        {
            System.out.println(x);
        }
    }
}

//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37