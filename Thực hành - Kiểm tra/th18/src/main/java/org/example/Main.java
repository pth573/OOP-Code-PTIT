package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new  Scanner(new File("DANHSACH.in"));
        Scanner sc = new  Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\th18\\src\\main\\java\\org\\example\\ABC"));

        Map<String, Integer> m = new HashMap<String, Integer>();
        Set<String> se = new HashSet<>();
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] arr = s.split("\\s+");
            String str = "";
            for(int i = 0; i < arr.length; i++)
            {
                str += arr[i];
            }
            if(!se.contains(str) && str.length() > 0)
            {
                String ans = "";
                ans += arr[arr.length - 1];
                for(int i = 0; i < arr.length - 1; i++)
                {
                    if(arr[i].length() > 0)
                    {
                        ans += arr[i].charAt(0);
                    }
                }
                if(m.containsKey(ans))
                {
                    System.out.println(ans + (m.get(ans) + 1) + "@ptit.edu.vn");
                    m.put(ans, m.get(ans) + 1);
                }
                else
                {
                    m.put(ans, 1);
                    System.out.println(ans + "@ptit.edu.vn");
                }
                se.add(str);
            }

        }
    }
}