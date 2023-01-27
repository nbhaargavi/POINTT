package org.example;
import java.util.Scanner;
public class credit implements Cloneable {
    private String cname;
    private Integer cno;
    private Integer cnum = 501005463;
    private Integer expdate;

    public credit( String cname,Integer cno, Integer expdate) {
        this.cname=cname;
        this.cno=cno;
        this.expdate=expdate;
    }
    void eq()
    {
        if(cnum.equals(cno)) {
            System.out.println("Credit card number matched!");
        }
        else
        {
            System.out.println("OOPS! Credit card number doesn't match");
        }
    }
    credit cr()
    {
        try
        {
            return (credit) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("cloned error");
            return this;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the credit card holder name:");
        String cname = sc.next();
        System.out.println("Enter the credit card number:");
        Integer cno = sc.nextInt();
        System.out.println("Enter the expiration date:");
        Integer expdate = sc.nextInt();
        credit c1=new credit(cname,cno,expdate);
        credit c2= c1.cr();
        c2.eq();
    }
}
