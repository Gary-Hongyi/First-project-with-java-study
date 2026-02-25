package com.study;
import java.util.Scanner;

public class MathMethod {
    public static void main(String[] args){


        double x = 39.9;
        double y = -40;

        double z = Math.max(x,y);
        System.out.println(z);
        //abs  absolute  value 绝对值
        double h = Math.abs(y);
        System.out.println(h);
        //sqrt 开平方
        double m = Math.sqrt(x);
        System.out.println(m);
        //round 约等于，是四舍五入而不是向下取整，ceil总是向上取整， floor总是向下取整
        double k = Math.round(x);
        System.out.println(k);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a；");
        double a = scanner.nextInt();
        System.out.println("Enter side b；");
        double b = scanner.nextInt();

        double c =Math.sqrt(a*a +b*b);

        System.out.println("The Hypotenuse of the Triangle is" + c);
        scanner.close();//及时关闭scanner是好习惯
    }
}
