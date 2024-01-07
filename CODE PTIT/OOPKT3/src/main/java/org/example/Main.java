package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHON.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
//        Scanner sc1 = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\OOPKT3\\src\\main\\java\\org\\example\\MONHOC.in"));
//        Scanner sc2 = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\OOPKT3\\src\\main\\java\\org\\example\\GIANGVIEN.in"));
//        Scanner sc3 = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\OOPKT3\\src\\main\\java\\org\\example\\GIOCHUAN.in"));
        ArrayList<Mon> arr1 = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= n; i++){
            String a = sc1.nextLine().trim();
            String[] arr = a.split("\\s+");
            String ma = "";
            if(arr.length >= 1)
                ma = arr[0];
            String ten = "";
            for(int j = 1; j < arr.length; j++){
                if(j == arr.length - 1) ten += arr[j];
                else ten += arr[j] + " ";
            }
            arr1.add(new Mon(ma, ten));
        }
        ArrayList<GV> arr2 = new ArrayList<>();
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i <= m; i++){
            String a = sc2.nextLine().trim();
            String[] arr = a.split("\\s+");
            String ma = "";
            if(arr.length >= 1)
                ma = arr[0];
            String ten = "";
            for(int j = 1; j < arr.length; j++){
                if(j == arr.length - 1) ten += arr[j];
                else ten += arr[j] + " ";
            }

            arr2.add(new GV(ma, ten));
        }

        ArrayList<Time> arr3 = new ArrayList<>();
        int h = Integer.parseInt(sc3.nextLine());
        for(int i = 1; i <= h; i++){
            String magv = sc3.next().trim();
            String mamon = sc3.next().trim();
            Double time = Double.parseDouble(sc3.next());
            arr3.add(new Time(magv, mamon, time));
        }
        for(Time x : arr3){
            for(GV y : arr2){
                if(x.getGv().equals(y.getId())){
                    System.out.println(y.getName() + " " + String.format("%.2f", x.getGpa()));
                }
            }
        }
    }
}