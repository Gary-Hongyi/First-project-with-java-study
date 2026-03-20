package com.study;
//关联 Auto
// getter 方法就是负责收集字段的数据
// getter 用于收集，setter 用于更改
public class Encapsulation {
    // Encapsulation = attributes of a class will be hidden or private,
    //                 can be accessed only through methods (getters & setters)
    public static void main(String[] args){
    //
        Auto auto = new Auto("Apple","Applecar",2026);
        //System.out.println(auto.make); 直接打印会报错，因为make是private信息 要去Auto 用getter
        System.out.println(auto.getMake());
        System.out.println(auto.getYear());

        //auto.make = "xiaomi";  会报错，private 变量不能在访问时直接改 要去Auto 用setter
        auto.setYear(2027);
        System.out.println(auto.getYear());

    }
}
