import java.util.Scanner;

public class Main
{
    public static long gcd(long a, long b)
    {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public static boolean mod10(String n)
    {
        int sum = 0;
        for(int i = 0; i < n.length(); i++)
        {
            sum += (n.charAt(i) - '0');
        }
        return sum % 10 == 0;
    }

    public static boolean solve(String n)
    {
        for(int i = 0; i < n.length() - 1; i++)
        {
            if(Math.abs(n.charAt(i) - n.charAt(i + 1)) != 2) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long x = 1;
            for(int i = 2; i <= n; i++)
            {
//                System.out.println(" " + x +  " " + i);
                long tmp = gcd(x, i);
                long lcd = (x * i) /  tmp;
                x = lcd;
//                System.out.println(tmp);
//                System.out.println(lcd);
//                System.out.println(" " + x +  " " + i);
//                System.out.println(" " + tmp +  " " + lcd);
            }
            System.out.println(x);
        }
    }
}

//3
//1353
//246864
//123435
