package com.study;
//关联Pizza
public class OverloadedConstructors {
    //overloaded constructors = multiple constructors within a class with the same name,
    //                          but have different parameters
    //                          name + parameters = signature

    public static void main(String[] args){
        Pizza pizza = new Pizza("thick","tomato","yellow");

        System.out.println("Here is your pizza ingredients");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        // 如果我现在不想要四个成分都有的Pizza怎么办,重载构造函数
    }
}
