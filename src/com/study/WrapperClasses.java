package com.study;

public class WrapperClasses {
    public static void main(String[] args){
        // wrapper class = provides a way to use primitive data types as reference data types
        //reference data types contain useful methods  原始数据类型--引用数据类型
        //can be used with collections (ex.ArrayList) 比如可以用在数组列表

        //primitive        //wrapper
        //---------        //-------
        //boolean            Boolean
        //char               Character
        // int               Integer
        // double          //Double



        //create 几个类型
        Boolean a = true;  //java 自动完成了 autoboxing 转换
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Gary";

        if(b=='@'){  //java 自动完成了 unboxing转换，还是能看成primitive value 来进行运作，但是系统内部步骤多，速度慢
            System.out.println("This is true");
            System.out.println(Integer.max(c, 20));
            System.out.println(Integer.toBinaryString(c));
        }
    }
}
