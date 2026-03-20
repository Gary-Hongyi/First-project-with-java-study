package com.study;

public class Good extends Animals {
    @Override
    void speak() {
        System.out.println("The good animal is speaking kindly");
    }

    @Override
    void eat() {
        System.out.println("The zoomanager is feeding the good animal");
    }

    void behave() {
        System.out.println("The good animal behaves well");
    }
}