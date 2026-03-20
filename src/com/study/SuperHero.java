package com.study;

public class SuperHero extends Person{
    String power;
    SuperHero(String name,int age, String power){
        //this.name = name
        //this.age = age 最好不要这样写，因为name 和 age 都是父类的，让父类统一处理，子类用super继承
        super(name,age);  //将父类的东西用super 后续会涉及到封装原则
        this.power = power;
    }
    public String toString(){
        return super.toString() + this.power;
    }

}
