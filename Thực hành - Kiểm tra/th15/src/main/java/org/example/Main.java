package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String x = sc.nextLine();
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger("7");
            BigInteger c = new BigInteger("13");
            int check1 = 0;
            int check2 = 0;
            if(a.mod(b).equals(BigInteger.ZERO))
            {
                check1 = 1;
            }
            if(a.mod(c).equals(BigInteger.ZERO))
            {
                check2 = 1;
            }
            if(check1 == 1 && check2 == 1)
            {
                System.out.println("Both");
            }
            else if(check1 == 1)
            {
                System.out.println("Div 7");
            }
            else if(check2 == 1)
            {
                System.out.println("Div 13");
            }
            else System.out.println("None");
        }
    }
}