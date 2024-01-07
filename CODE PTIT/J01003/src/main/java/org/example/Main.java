
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0 && b == 0) System.out.println("VSN");
        else if(a == 0 && b != 0) System.out.println("VN");
        else
        {
            double ans =  -b / a;
//            DecimalFormat str = new DecimalFormat("#.##");
//            String x = str.format(ans);
//            System.out.println(x);
            System.out.format("%.2f", ans);
        }
    }
}

//import java.text.DecimalFormat;
//
//public class Main {
//    public static void main(String[] args) {
//        double number = 3.14159265359;
//
//        // Định dạng số thập phân sau dấu phẩy với 2 chữ số
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        String formattedNumber = decimalFormat.format(number);
//
//        System.out.println("Số sau khi định dạng: " + formattedNumber);
//    }
//}
