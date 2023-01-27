package org.example;
import java.util.Scanner;
public class Point implements Cloneable {
    private Integer x;
    private Integer y;
    public Point( Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    void eq()
    {
        System.out.println(x.equals(y));
    }
    protected Object Clone() throws  CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x coordinate:");
        Integer x = sc.nextInt();
        System.out.println("enter the y coordinate:");
        Integer y = sc.nextInt();
        Point p1=new Point(x,y);
        Point p2=(Point)p1.clone();
        p2.eq();
    }
}
