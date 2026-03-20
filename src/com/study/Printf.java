package com.study;

public class Printf {
    public static void main(String[] args){

        //printf = an optional method to control , format, and display text to the console window(控制台窗口）
        //         two arguments = format string + (object/variable/value)
        //         %

        System.out.printf("%d This is a format string",123);

        // [conversion - character] %...    其实很像是占位符
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Gary";
        int myInt = 40;
        double myDouble = 1000;
        //格式说明符后面要加上转换符
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //width
        //minimum number of characters to be written as output  %数字s  最后就会显示占多少位的output
        System.out.println();
        System.out.printf("Hello %10s",myString);//  如果写%-10s  这将会是占用位置的左对齐

        //precision 精度
        System.out.println();
        System.out.printf("You have this much money   %.2f", myDouble);// .几 表示后面跟几个小数点

        //flags  +(显示正号)  -（左对齐，后面正常要有位数）   ,(分成3位3位分割） 0（加上宽度表示空白都用0填充）
        System.out.printf("You have this much money   %+f", myDouble);
        System.out.println();
        System.out.printf("You have this much money   %-20f  daring", myDouble);
        System.out.println();
        System.out.printf("You have this much money   %,f", myDouble);
        System.out.println();
        System.out.printf("You have this much money   %010f", myDouble);
    }
}
