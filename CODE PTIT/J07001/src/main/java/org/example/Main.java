package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\J07001\\src\\main\\java\\org\\example\\Data.txt"));
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}