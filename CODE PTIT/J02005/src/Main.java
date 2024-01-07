import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[1001];
        for(int i = 0; i < 1001; i++)
        {
            c[i] = 0;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(c[a[i]] == 0)
            {
                list.add(a[i]);
                c[a[i]]++;
            }
        }
        for(int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
            if (c[b[i]] == 0)
            {
                list.add(b[i]);
                c[b[i]] = 1;
            }
        }
        Collections.sort(list);
        for(int x : list)
        {
            System.out.print(x + " ");
        }
    }
}