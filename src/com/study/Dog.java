package com.study;
//子类
public class Dog extends Animal{

    @Override // O是大写
    void speak(){
        System.out.println("The dog is barking now");
    }
}
