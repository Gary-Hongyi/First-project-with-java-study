package com.study;
//关联Human
public class Constructors {
    public static void main(String[] args){
        //constructor = special method that is called when an object is instantiated(created)
        //构造函数，对象诞生时就有初始状态

        Human human1 = new Human("Jorn",18,70);//
        System.out.println(human1.name);
        Human human2 = new Human("Gary",18,67);
        System.out.println(human2.weight);

        human2.eat();
        human1.drink();


    }
}
