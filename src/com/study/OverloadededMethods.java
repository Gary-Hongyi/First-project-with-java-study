package com.study;

public class OverloadededMethods {
    public static void main(String[] args){
        //overloaded methods = methods that share the same name but have different parameters(参数）
        //                     method name +parameters = method signature
        int x = add(1,2);
        int y = add(1,2,3);  //调用方法就是将方法里头的代码执行一遍
        System.out.println(x);
        System.out.println(y);

        double z = add(2.10,12.26);
        double h = add(5.14, 2.12,3.14);
        System.out.println(z);
        System.out.println(h);


    }
    static int add(int a, int b){//add=name  parameters = 括号里的量
        System.out.println("This is overloaded #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded #2");
        return a+b+c;
    }
    static double add(double a, double b){//add=name  parameters = 括号里的量
        System.out.println("This is overloaded #3");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded #4");
        return a+b+c;
    }
}
