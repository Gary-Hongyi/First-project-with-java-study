package com.study;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }
    public double calculate(){

        return Math.PI*r*r;

    }

}
