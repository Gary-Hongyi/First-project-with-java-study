package com.study;

public class Bike extends Vehicle{
    // 子类里必须写父类里abstract 的方法
    @Override
    void go(){
       System.out.println( "The driver is driving the car");
    }
}
