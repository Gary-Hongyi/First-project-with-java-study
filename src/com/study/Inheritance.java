package com.study;
// 关联 Advisor Songxu Zengyi
public class Inheritance {
    public static void main(String[] args){
        //inheritance = the process where one class acquires,the attributes(属性) and methods of another.

        // Songxu 和 Zengyi 继承 Advisor

        Songxu songxu = new Songxu();
        Zengyi zengyi = new Zengyi();

        songxu.go();
        zengyi.stop();

        System.out.println(songxu.speed);
        System.out.println(zengyi.dick);
        System.out.println(songxu.hair);
    }
}
