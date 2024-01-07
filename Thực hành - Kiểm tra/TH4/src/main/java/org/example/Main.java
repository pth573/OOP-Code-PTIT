package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Polygon {
    Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public String getArea() {
        double area = 0.0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            int x1 = points[i].x;
            int y1 = points[i].y;
            int x2 = points[(i + 1) % n].x;
            int y2 = points[(i + 1) % n].y;
            area += (x1 * y2 - x2 * y1);
        }
        area = Math.abs(area) / 2.0;
        return String.format("%.3f", area);
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
//        Scanner in = new Scanner(new File("G:\\OneDrive - ptit.edu.vn\\Desktop\\JAVA ptit\\TH4\\src\\main\\java\\org\\example\\POLYGON.in"));
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Point(in.nextInt(), in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
