package com.study;
//关联Car
public class ToStringMethod {
    public static void main(String[] args){
// toString method 让main 方法打印其他类的信息更方便，不要一个一个输
        Car car = new Car();

        System.out.println(car.toString());// 打印car  // 显式写法

        System.out.println(car); // implicitly 隐式写法   如果没有用toString则是打印这个对象在内存中的位置

        /*现在去 Car 类里面写这个方法
        public String toString(){  //写法固定如此public String toString(){}
            return make + "\n" +model + "\n" + color;*/
        }
}
