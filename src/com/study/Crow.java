package com.study;

public class Crow extends Animals{
    @Override
    void speak() {
        System.out.println("Ya Ya");
    }
    void curse(){
        System.out.println("You are such a ugly boy");
    }
    public void push(){
        System.out.println("The Crow is not familiar with people");
    }
    @Override
    void eat(){
        System.out.println("The zoomanager is feeding crow");
    }
}
