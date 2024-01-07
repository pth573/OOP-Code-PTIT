package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\TH25\\src\\main\\java\\org\\example\\VANBAN.in"));
        List<String> li = new ArrayList<>();
        TreeSet<String> se = new TreeSet<>();
        Pattern pattern = Pattern.compile(".*\\d+.*");
        while(sc.hasNext())
        {
            String s = sc.next();
            Matcher matcher = pattern.matcher(s);
            if(matcher.matches() && !s.contains(".") && !s.contains(",") && !s.contains("!") && !s.contains("?") && !s.contains(":"))
            {
//                System.out.println(s);
                se.add(s);
            }
        }
        for (String x : se)
        {
            System.out.println(x);
        }
    }
}