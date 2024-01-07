package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        ObjectInputStream sc = new ObjectInputStream(new FileInputStream(""));
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            BigInteger x = new BigInteger(a);
            int cnt = 0;
            while(!x.mod(new BigInteger("13")).equals(BigInteger.ZERO) && cnt <= 1000){
                StringBuilder sb = new StringBuilder(a);
                BigInteger y = new BigInteger(sb.reverse().toString());
//                System.out.println(x + " " + y);
                x = y.add(x);
                a = x.toString();
                cnt++;
            }
            if(cnt > 1000) System.out.println("-1");
            else System.out.println(x.toString());
        }
    }
}