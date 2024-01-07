package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
        List<Integer> li = new ArrayList<>();
        int i = 0;
        while(sc.hasNext())
        {
            int x = sc.nextInt();
            i++;
            if(check(String.valueOf(x)) == 1) li.add(x);
            if(m.containsKey(x))
            {
                m.put(x, m.get(x) + 1);
            }
            else
            {
                m.put(x, 1);
                m2.put(x, i);
            }
            Collections.sort(li, new Comparator<Integer>() {
                @Override
                public int compare(Integer t1, Integer t2)
                {
                    if(m.get(t1) < m.get(t2)) return 1;
                    else if(m.get(t1) == m.get(t2))
                    {
                        return m2.get(t1) - m2.get(t2);
                    }
                    else return -1;
                }
            });
        }
        for (Integer a: li)
        {
            if(m.containsKey(a))
            {
                if(m.get(a) > 0)
                {
                    System.out.println(a + " " + m.get(a));
                    m.put(a, 0);
                }
            }
//            System.out.println(a + " " + m.get(a));
        }
    }

    public static int check(String s)
    {
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) > s.charAt(i + 1)) return 0;
        }
        return 1;
    }
}