package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\th111\\src\\main\\java\\org\\example\\DATA.in"));
        long sum = 0;
        while(sc.hasNext())
        {
            String s = sc.next();
            try
            {
                int x = Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                try
                {
                    long y = Long.parseLong(s);
                    sum += y;
                }
                catch (NumberFormatException e1)
                {
                }
            }
        }
        System.out.println(sum);
    }
}