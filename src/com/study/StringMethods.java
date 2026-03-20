package com.study;

public class StringMethods {
    public static void main(String[] args){

        //字符串名.     查看所有可以用的方法，但并不是都有用
        // example 比较正确与否 .equals   忽略大小写
        String name = "Gary";
        boolean result = name.equalsIgnoreCase("gary");
        System.out.println(result);

        //.length 看长度
        int result2 = name.length();
        System.out.println(result2);

        //.charAt 看具体位置的字母
        char result3 = name.charAt(2);
        System.out.println(result3);

        //.indexOf 看这个字母在哪个具体位置
        int result4 = name.indexOf("r");
        System.out.println(result4);

        //.isEmpty 看看是不是空的
        boolean result5 = name.isEmpty();
        System.out.println(result5);

        //.toUpperCase 小写变大写  toLowerCase 大写-小写
        String result6 = name.toUpperCase();

        System.out.println(result6);
        //.Trim 删减字符串内的所有空格

        //.replace name.replace('o', 'a');

        String result7 = name.replace('r','y');




    }
}
