package com.study;

import java.util.ArrayList;

public class ZooManager {
    ArrayList<Animals> zoo = new ArrayList<Animals>();// 不管后面要不要传参数，初始都用new来进行初始化
    public void setZoo(ArrayList<Animals> zoo){
        this.zoo = zoo;
    }
    //zoomanager 喂食
    public void feed(){ //定义方法后面不要忘记加入()
        for(Animals i: zoo){
            i.eat();
        }
        System.out.println("The feeding is over");
    }
    //zoomanager 训练
    public void train(){
        for(Animals i : zoo){
            i.speak();
        }
        System.out.println("The train is over, every animal has spoken");
    }


}
