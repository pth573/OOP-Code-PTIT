import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int c[] = new int[100001];
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                c[a[i]]++;
            }
            System.out.println("Test " + k + ":");
            for(int i = 0; i < n; i++)
            {
                if(c[a[i]] > 0)
                {
                    System.out.println(a[i] + " xuat hien " + c[a[i]] + " lan");
                    c[a[i]] = 0;
                }
            }
        }
    }
}