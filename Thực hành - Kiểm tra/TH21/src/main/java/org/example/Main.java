package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        List<BigInteger> li = new ArrayList<>();
        int n  = sc.nextInt();
        BigInteger ans = new BigInteger("0");
        for(int i = 0; i < n; i++)
        {
            String tmp = sc.next();
            BigInteger x = new BigInteger(tmp);
            li.add(x);
            ans = ans.add(x);
        }
        BigInteger x = Collections.min(li);
        BigInteger y = Collections.max(li);
        System.out.println(x + "\n" + y + "\n" + ans + "\n");
    }
}

//5
//213
//2435
//653224
//34326
//6467