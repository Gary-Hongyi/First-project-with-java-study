package com.study;
// 关联 Food Hero
public class ArrayOfObjects {
    public static void main(String[] args){

        //正常创建数组
        int[] numbers = new int[3];
        char[] characters = new char[4];
        // 创建对象数组(空的)  方法一
        Food[] refrigerator = new Food[3]; //命名方式一样，但是前提是要先有这个对象在包里面

        Food food1 = new Food("pizza");
        Food food2 = new Food("piz");
        Food food3 = new Food("pi");
        //把创建好的对象放在数组里
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);  //自定义对象要.属性名   否则只会返回储存地址


        Hero Hero1 = new Hero("James");
        Hero Hero2 = new Hero("Curry");
        Hero Hero3 = new Hero("Harden");
        //创建对象数组（方法2）
        Hero[] allstar = {Hero1,Hero2,Hero3};  //和最开始的直接赋值数组一样，也是用大括号包起来

        System.out.println(allstar[2].name);


    }
}
