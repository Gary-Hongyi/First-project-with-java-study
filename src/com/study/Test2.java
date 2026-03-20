
/*
*题目：综合数组与之前知识的购物清单管理
题目描述：
你正在为一个小型超市开发一个简单的购物清单管理系统。该系统需要能够管理多种商品类别（如面包类、果蔬类、饮料类等），每种类别下包含具体的商品名称。此外，系统还需要能够进行一些基本的查询和统计操作。

*
* 题目要求：
定义商品类别和商品：
使用 ArrayList 来存储不同的商品类别，每个类别也是一个 ArrayList，存储该类别下的具体商品名称（字符串）。
初始化至少三个类别，每个类别包含不少于三个具体商品。
添加商品功能：
实现一个方法 addProduct(String category, String product)，该方法可以在指定类别下添加新的商品。
查询商品功能：
实现一个方法 getProductsByCategory(String category)，返回指定类别下的所有商品列表。
实现一个方法 searchProduct(String product)，检查某个商品是否存在于任何类别中，如果存在则返回该商品所属的类别名称，否则返回 "Not Found"。
统计功能：
实现一个方法 countProducts()，返回所有类别中商品的总数。
输出功能：
实现一个方法 printAllProducts()，以格式化的方式打印所有类别及其包含的商品。
*
*
* */
package com.study;
import java.util.*;
public class Test2{
    static ArrayList<String> food = new ArrayList();
    static ArrayList<String> fruit = new ArrayList();
    static ArrayList<String> drink = new ArrayList();
    static ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
    public static void main(String[] args){
        groceryList.add(food);
        groceryList.add(fruit);
        groceryList.add(drink);


    food.add("bread");
    food.add("sausage");
    food.add("rice");

    fruit.add("banana");
    fruit.add("apple");
    fruit.add("watermelon");

    drink.add("coco");
    drink.add("tea milk");
    drink.add("milk");

    //调用测试

      addProduct("drink","tea");// 加双引号

        getProductsByCategory("food");

       String return_result = searchProduct("watermelon");
       System.out.println("This product is " + return_result);

       int number = countProduct("fruit");
       System.out.println(number+" product in this type");

       int total =countAllProduct();
       System.out.println("The total has " + total + " products");

       printAllProduct();

    }
//在特定类别添加商品
    static void addProduct(String category, String product){
      if(category.equals("food")){
          food.add(product);
      }
      else if(category.equals("fruit")){
          fruit.add(product);
      }
      else if(category.equals("drink")){
          drink.add(product);
        }
      else{
          System.out.println("Our grocery dos not provide this kind of product");
      }

    }
//输出特定种类下的商品
    static void getProductsByCategory(String category){
        switch(category){
            case "food": for(int i=0;i<food.size();i++){
                System.out.println(food.get(i));
                break;}
            case "fruit": for(int j=0;j<fruit.size();j++){
                    System.out.println(fruit.get(j));
                break;}
            case "drink": for(int j=0;j<drink.size();j++){
                System.out.println(drink.get(j));
                break;}
           /*for(String i:drink){
               System.out.println(i);  */   // 除了用常规else if, switch, 增强版for loop 也常常用作数组打印
           }
    }
     //判断有没有该物品
    static String searchProduct(String product){
     //ArrayList 有一个.contains 方法，可以判断列表里有没有该目标
        // 列表名.contains(物品名)  括号里的数据类型必须和括号里的数据类型一致

        if(food.contains(product)){
            return "in food";}
        else if(fruit.contains(product)){
            return "in fruit";}
        else if(drink.contains(product)){
            return "in drink";}
        else{
            return "not found";
        }
    }
    //某一个种类中的物品有几个
    static int countProduct(String category){
        switch(category){
            case "food": return food.size(); //有return 的情况是可以不加break 的
            case "fruit": return fruit.size();
            case "drink": return drink.size();
            default :return 0;
        }
    }
    //统计所有物品的个数
    static int countAllProduct(){
        int number = 0;
        for(ArrayList<String> i : groceryList){// 类型 变量 : 所需遍历的数组
            number += i.size();
        }
        return number;
    }
//打印所有的种类和物种
    static void printAllProduct(){
        String[] categorynames ={"food","fruit","drink"};// 提取不出数组名，只能再建一个来存放
        int i = 0;
        for(ArrayList<String> j : groceryList){//只要j还活着就继续执行
            String items = String.join(",", j);
            System.out.printf("[%s] : %s%n",categorynames[i],items);//用到数组的知识
            i++;
        }
    }
}