package org.example;

import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0)
        {
            String[] str1 = sc.nextLine().split(" ");
            String[] str2 = sc.nextLine().split(" ");
            Map<String, Integer> m = new HashMap<String, Integer>();
            for(int i = 0; i < str2.length; i++)
            {
                if(m.containsKey(str2[i]))
                {
                    m.put(str2[i], m.get(str2[i]) + 1);
                }
                else m.put(str2[i],1);
            }
            //dau
            Set<String> s = new TreeSet<String>();
            for(int i = 0; i < str1.length; i++)
            {
                if(!m.containsKey(str1[i]))
                {
                    s.add(str1[i]);
                }
            }
            for (String x : s)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// ghe qua
//2
//        abc ab ab ab abcd
//        ab abc
//        aaa xyz ab zzz abc dd dd abc
//        xyz dd ttt sas cdc