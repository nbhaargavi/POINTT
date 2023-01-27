package org.example;
import java.util.Scanner;
public class Point {
    private int x;
    private int y;
    public Point( int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point pt = (Point) o;
        return x == pt.x &&
                y == pt.y;
    }
    public Point clone() {
        return new Point(x, y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x coordinate:");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate:");
        int y = sc.nextInt();
        Point p1=new Point(x,y);
        Point p2=p1.clone();
        System.out.println("The cloned coordinates are "+p2.x+" and "+p2.y);
        System.out.println("The two points "+p1.x+" and "+p1.y+" are "+p1.equals(p2));
    }
}