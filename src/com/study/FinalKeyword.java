package com.study;

public class FinalKeyword {
    public static void main(String[] args){
        //正常情况下值是可以被更新的，但是final 不行
        double PI = 3.141;   //约定俗成  final量要大写
        PI = 4;
        System.out.println(PI);

        final String BELOVE = "Ly";
       System.out.println(BELOVE);

    }
}
