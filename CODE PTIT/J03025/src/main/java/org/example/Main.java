package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String x = sc.next();
            if(!check(x))
            {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
    public static boolean check(String x)
    {
        int l = 0;
        int r = x.length() - 1;
        int cnt = 0;
        while(l <= r)
        {
            if(x.charAt(l) != x.charAt(r))
            {
                cnt++;
            }
            if(cnt > 1) return false;
            l++; r--;
        }
        return true;
    }
}


//3
//abccaa
//abbcca
//abcda