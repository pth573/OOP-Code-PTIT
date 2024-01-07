
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            int check = 1;
            String s = sc.nextLine();
            String tmp = "";
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9')
                {
                    System.out.println("INVALID");
                    check = 0;
                    break;
                }
                if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') tmp = tmp + "0";
                else if(s.charAt(i) == '1') tmp += "1";
            }
            if(check == 0) continue;
            int i = 0;
            String ans = "";
            while(i < tmp.length() && tmp.charAt(i) == '0')
            {
                i++;
            }
            if(i == tmp.length()) System.out.println("INVALID");
            else
            {
                while(i < tmp.length())
                {
                    ans += tmp.charAt(i);
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}