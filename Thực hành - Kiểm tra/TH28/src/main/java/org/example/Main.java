package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<User> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String user = sc.next();
            String pass = sc.next();
            li.add(new User(user, pass, 0));
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= m; i++)
        {
            String user = sc.next();
            String pass = sc.next();
            for (User x : li)
            {
                String a = x.getUser();
                String b = x.getPass();
                if (a.equals(user) && b.equals(pass))
                {
                    x.setCnt(x.getCnt() + 1);
                }
            }
        }
        for (User x : li) {
//            System.out.println(x.getUser() + " " + x.getPass() + " " + x.getCnt());
            System.out.print(x.getCnt() + " ");
        }
    }
}

//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password