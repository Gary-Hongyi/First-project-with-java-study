package com.study;

import java.util.ArrayList;//需要引用


public class Arraylist {
    public static void main(String[] args){
        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("fish");
        food.add("chicken");

        food.set(0,"sushi");  //.set   可以改变数组列表某个特定地方的内容
        food.remove(2); // .remove 移动走数组某个序号的值
        food.clear();  // .clear 清除所有的值   食物吃光啦！！！

        for(int i=0;i<food.size();i++){  //与普通数组length不同，这里用的是 size()
           System.out.println(food.get(i));// 这里多了.get 且使用小括号

        System.out.println(food);//第二种输出方法，但不可以自定义格式，外面会包中括号
        }
    }
}
