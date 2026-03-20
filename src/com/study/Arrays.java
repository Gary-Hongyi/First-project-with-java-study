package com.study;

public class Arrays {
    public static void main(String[] args){
        //array used to store multiple values in a single variable

        //定义数组方法1
        String[] cars ={"Camaro","Corvette"};// 添加的数据类型要和数组的数据类型保持一致
        cars[0] = "Mustang";

        System.out.println(cars[1]);//计算机默认从0开始

        //定义数组方法2
        String[] heros = new String[3]; //3写的是里面有多少个元素 一定要大于等于实际的否则会报错，比如我写2就会报错，下面有三个球星

        heros[0] = "Stephen";
        heros[1] = "James";
        heros[2] = "Durant";
        System.out.println(heros[2]);

        //用for 遍历数组
        for(int i=0; i<cars.length; i++){ //数组名.length 转化数组的元素个数
            System.out.println(cars[i]);
        }
    }
}
