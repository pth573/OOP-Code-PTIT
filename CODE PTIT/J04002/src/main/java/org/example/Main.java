package org.example;
import rectange.Rectange;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            String z = sc.next();
            if(x <= 0 || y <= 0)
            {
                System.out.println("INVALID");
                return;
            }

//            Rectange rec = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
            Rectange rec = new Rectange(x, y, z);
            System.out.println((int)rec.findPerimeter() + " " + (int)rec.findArea() + " " + rec.getColor());
        }
        catch (Exception e)
        {
            System.out.println("INVALID");
        }
    }
}