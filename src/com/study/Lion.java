package com.study;

public class Lion extends Animals{
    @Override
    void speak(){
        System.out.println("Awh Awh");
    }
    void hunt(){
        System.out.println("The Lion is hunting");
    }
    public void push(){
        System.out.println("The Lion like to eat people");
    }
    @Override
    void eat(){
        System.out.println("The zoomanager is feeding lion");
    }
}
