package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc1.nextLine());

        List<SV> list1 = new ArrayList<>();
        while(n-- > 0){
            SV sv = new SV(sc1.nextLine().trim(), chuanhoa(sc1.nextLine().trim()), sc1.nextLine().trim(), sc1.nextLine().trim());
            list1.add(sv);
        }

        List<Mon> list2 = new ArrayList<>();
        int m = Integer.parseInt(sc2.nextLine());
        while(m-- > 0){
            Mon x = new Mon(sc2.nextLine().trim(), sc2.nextLine().trim(), Integer.parseInt(sc2.nextLine().trim()));
            list2.add(x);
        }

        List<Diem> list3 = new ArrayList<>();
        int k = Integer.parseInt(sc3.nextLine());

        String a = "";

        while(k-- > 0){
            String masv = sc3.next();
            a = masv;
            String mamon = sc3.next();
            Double diem = sc3.nextDouble();
            Diem bangdiem = new Diem();
            bangdiem.setDiem(diem);
            for(SV x : list1){
                if(x.getMa().equals(masv)){
                    bangdiem.setSv(x);
                    break;
                }
            }
            for(Mon x : list2){
                if(x.getMa().equals(mamon)){
                    bangdiem.setMon(x);
                    break;
                }
            }
            list3.add(bangdiem);
        }
        Collections.sort(list3);
        sc3.nextLine();
        int h = Integer.parseInt(sc3.nextLine());
        while(h-- > 0){
            String lop = sc3.nextLine();
            System.out.println("BANG DIEM lop " + lop + ":");
            for(Diem x : list3){
                if(x.getSv().getLop().equals(lop)){
                    System.out.print(x.getSv().getMa() + " " + x.getSv().getTen() + " " + x.getMon().getMa() + " " + x.getMon().getTen() + " ");
                    if((int) x.getDiem() == x.getDiem()){
                        System.out.println((int) x.getDiem());
                    }
                    else System.out.println(x.getDiem());
                }
            }
        }
    }

    public static String chuanhoa(String s){
        String[] tmp = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < tmp.length; i++){
            ans += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1).toLowerCase() + " ";
        }
        return ans.trim();
    }
}
