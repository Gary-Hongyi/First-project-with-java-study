package com.study;

import java.util.*;
public class arraylist2D {
    public static void main(String[] args){
        // 2D ArrayList = a dynamic list of lists 动态列表的列表

        //create 2D Arraylist
        ArrayList<ArrayList<String>>  groceryList = new ArrayList<ArrayList<String>>();
        ArrayList<String> food = new ArrayList();
        food.add("Curry");
        food.add("Harden");
        food.add("Durant");

        System.out.println(food); //直接可以打印
        System.out.println(food.get(0)); //指定打印

        ArrayList<String> bread = new ArrayList();
        bread.add("Alex");
        bread.add("Sweaty");
        bread.add("Damn");

        ArrayList<String> drinks = new ArrayList();
        drinks.add("fuck");
        drinks.add("you");

        //给2D 数组列表添加列表
        groceryList.add(food);
        groceryList.add(bread);
        groceryList.add(drinks);
        //0 对应第一个添加的子列表

        System.out.println(groceryList.get(0).get(0)); //输出第一个数组列表第一个元素


    }
}
