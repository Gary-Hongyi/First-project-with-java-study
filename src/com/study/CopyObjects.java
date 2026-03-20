package com.study;
//关联 Auto
public class CopyObjects {
    public static void main(String[] args){


        Auto auto1 = new Auto("Tesla","model3",2024);
        Auto auto2 = new Auto("Xiaomi","su7",2026);
        auto2.copy(auto1);

        Auto auto3 = new Auto(auto1); // 在实例化时就复制信息，不过前提是要写一个Overloaded constructor
        System.out.println(auto1);
        System.out.println(auto2);//打印储存内存
        System.out.println();
        System.out.println(auto1.getMake());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getYear());
        System.out.println();
        System.out.println(auto2.getMake());
        System.out.println(auto2.getModel());
        System.out.println(auto2.getYear());

        // 想要复制车辆的信息，最好的方法是在Auto里面写copy method
        auto2.copy(auto1); //代码一行一行执行，放打印的后面则体现不出复制结果

    }
}
