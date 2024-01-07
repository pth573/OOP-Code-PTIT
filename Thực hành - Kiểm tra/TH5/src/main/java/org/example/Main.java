package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số lượng bộ test

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            Stack<Integer> st = new Stack<>();
            int cnt = 1;
            int j = 0;
            int[] arr = new int[1001];
            int k = 0;
            while(j < s.length()){
                if(s.charAt(j) == '(')
                {
                    st.push(cnt);
                    arr[k] = cnt;
                    k++;
                    cnt++;
                }
                else if(s.charAt(j) == ')')
                {
//                    st.push(st.peek());
                    arr[k] = st.peek();
                    k++;
                    st.pop();
                };
                j++;
            }
            for (int h = 0; h < k; h++)
            {
                System.out.print(arr[h] + " ");
            }
            System.out.println();

        }
    }

}

//2
////(a+(b*c))+(d/e)
////((())(()))
