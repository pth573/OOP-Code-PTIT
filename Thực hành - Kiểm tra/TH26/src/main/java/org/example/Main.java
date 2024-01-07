package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> m = new HashMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();
        List<String> li = new ArrayList<>();
        for(int i = 1; i <= 5; i++)
        {
            String line = sc.next();
            li.add(line);
            if(check(line) == 1)
            {
                if(m.containsKey(line))
                {
                    m.put(line, m.get(line) + 1);
                }
                else
                {
                    m.put(line, 1);
                    m2.put(line, i);
                }
            }
        }
//        while(sc.hasNext())
//        {
//            String line = sc.next();
//            li.add(line);
//            if(check(line) == 1)
//            {
//                if(m.containsKey(line))
//                {
//                    m.put(line, m.get(line) + 1);
//                }
//                else m.put(line, 1);
//            }
//        }
        Collections.sort(li, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                int a = m.get(s);
                int b = m.get(t1);
                if(a == b)
                {
                    return s.compareTo(t1);
                }
                else
                {
                    return Integer.compare(a, b);
                }
            }
        });
//        for (String x : li)
//        {
//            if(m.containsKey(x))
//            {
//                System.out.println(x + " " + m.get(x));
//            }
//        }
        for (String x : li)
        {
            if(m.containsKey(x))
            {
                if(m.get(x) > 0)
                {
                    System.out.println(x + " " + m.get(x));
                    m.put(x, 0);
                }
            }
        }
    }

//    public static int check(String s)
//    {
//        for(int i = 0; i < s.length() - 1; i++)
//        {
//            if(s.charAt(i) > s.charAt(i + 1)) return 0;
//        }
//        return 1;
//    }
}
//
//
//package org.example;
//
//        import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
//        while(t-- > 0)
//        {
//            int n = sc.nextInt();
//            Integer[] a = new Integer[n];
//            for (int i = 0; i < n; i++)
//            {
//                a[i] = sc.nextInt();
//                if(m.containsKey(a[i]))
//                {
//                    m.put(a[i], m.get(a[i]) + 1);
//                }
//                else
//                {
//                    m.put(a[i], 1);
//                    m2.put(a[i], i);
//                }
//            }
//            Arrays.sort(a, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer t1, Integer t2)
//                {
//                    if(m.get(t1) < m.get(t2)) return 1;
//                    else if(m.get(t1) == m.get(t2))
//                    {
//                        return m2.get(t1) - m2.get(t2);
//                    }
//                    else return -1;
//                }
//            });
//            for (Integer x : a)
//            {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//    }
//}