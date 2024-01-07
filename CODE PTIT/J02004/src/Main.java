import java.util.Scanner;



public class Main {
    public static boolean dx(int a[], int n)
    {
        int check = 0;
        int l = 0; int r = n - 1;
        while(l <= r)
        {
            if (a[l] != a[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int n;
            n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
//            int check = 0;
//            int l = 0; int r = n - 1;
//            while(l <= r)
//            {
//                if (a[l] != a[r])
//                {
//                    check = 1;
//                    break;
//                }
//                l++;
//                r--;
//            }
            if(dx(a, n)) System.out.println("YES");
            else System.out.println("NO");
//            if(check == 1) System.out.println("NO");
//            else System.out.println("YES");
        }
    }
}