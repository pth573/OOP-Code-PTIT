import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int cnt = 0;
            for(int i = 2; i <= (int)(Math.sqrt(n)); i++)
            {
                if (n % i == 0 && i % 2 == 0) cnt++;
                if (n % (n / i)  == 0 && (n / i) % 2 == 0) cnt++;
            }
            int k = (int)Math.sqrt(n);
            if(k * k == n && k % 2 == 0) cnt--;
            if(n % 2 == 0) cnt++;
            System.out.println(cnt);
        }
    }
}