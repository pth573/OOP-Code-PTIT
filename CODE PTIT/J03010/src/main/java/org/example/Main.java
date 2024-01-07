package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// VI KO CO PACKAGE CHU SA O

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> m = new HashMap<String, Integer>();
        while(n-- > 0)
        {
            String[] words = sc.nextLine().split(" ");
            String[] tmp = new String[1000];
            int j = 0;
            for(String x : words)
            {
                if(!x.isEmpty())
                {
                    tmp[j] = x;
                    j++;
                }
            }
            String ans = "";
            int len = j;
            ans += tmp[len - 1].toLowerCase();
            for(int i = 0; i < len - 1; i++)
            {
                  ans += Character.toLowerCase(tmp[i].charAt(0));
            }
            if(m.containsKey(ans))
            {
                System.out.println(ans + (m.get(ans) + 1) + "@ptit.edu.vn");
                m.put(ans, m.get(ans) + 1);
            }
            else
            {
                System.out.println(ans + "@ptit.edu.vn");
                m.put(ans, 1);
            }
        }
    }
}

//4
//        nGUYEn    quaNG   vInH
//        tRan   thi THU    huOnG
//        nGO   quoC  VINH
//        lE            tuAn    aNHV