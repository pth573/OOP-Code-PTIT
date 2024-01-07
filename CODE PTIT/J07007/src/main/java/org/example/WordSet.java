package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet
{
    private Set<String> s;

    public WordSet(String fileName) throws IOException
    {
        s = new TreeSet<String>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext())
        {
            String str = sc.next().toLowerCase();
            s.add(str);
        }
    }

    @Override
    public String toString() {
        String ans = "";
        for (String x : s) {
            ans += x + "\n";
        }
        return ans;
    }
}
