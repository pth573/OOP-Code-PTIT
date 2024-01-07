import java.io.IOException;
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
            if(x <= 0 || y <= 0)
            {
                System.out.println(0);
                return;
            }
            System.out.print(2 * (x + y) + " ");
            System.out.println(x * y);
        }
        catch(Exception e)
        {
            System.out.println(0);
        }

    }
}