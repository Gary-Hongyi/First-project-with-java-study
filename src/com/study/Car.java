package com.study;

public class Car {
    //some attributes
    String make = "Tesla";
    String model = "model 3";
    int year = 2026;
    String color = "blue";
    double price = 50000.00;

    //关联toString method

    public String toString(){  // toString 的工作就是把东西转换成文字，year这样的int 也行
     return make + "\n" +model + "\n" + color+ "\n" + year;
    }
    //some methods
    void drive(){
        System.out.println("You drive a car");
    }
    void brake(){
        System.out.println("You step on the brakes");
    }
}
