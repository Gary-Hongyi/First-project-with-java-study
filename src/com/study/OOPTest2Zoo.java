package com.study;

import java.util.ArrayList;

//关联 ZooManager Animals Lion Good Bad Whale Crow
public class OOPTest2Zoo {
    public static void main(String[] args){
        ArrayList<Animals> myzoo = new ArrayList();
        Lion lion = new Lion();
        Whale whale = new Whale();
        Crow crow = new Crow();
        myzoo.add(lion);
        myzoo.add(whale);
        myzoo.add(crow);
        ZooManager zoomanager = new ZooManager();

        //展示继承的信息
        System.out.println(lion.name);
        System.out.println(crow.age);

        //调用个别的方法
        lion.speak();
        lion.hunt();
        lion.push();

        whale.bonus(35);
        whale.bonus(9);
        whale.praise();

        crow.curse();
        crow.push();

        //通过封装管理员执行任务
        zoomanager.setZoo(myzoo);
        zoomanager.feed();
        zoomanager.train();


    }
}
