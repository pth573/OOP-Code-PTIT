import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống sau số bộ test

        for (int i = 0; i < t; i++) {
            String number = sc.nextLine();
            if (isBeautifulNumber(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isBeautifulNumber(String number) {
        int length = number.length();

        // Kiểm tra số thuận nghịch
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - 1 - i)) {
                return false;
            }
        }

        // Kiểm tra chỉ toàn các chữ số nguyên tố
        for (int i = 0; i < length; i++) {
            int digit = number.charAt(i) - '0'; // Chuyển ký tự số thành giá trị số
            if (!isPrime(digit)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
