package com.study;

public class Rectangle extends Shape {

    private  double length;
    private double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width =width;
    }

    @Override
     public double calculate() {
        return length*width;

    }
}
