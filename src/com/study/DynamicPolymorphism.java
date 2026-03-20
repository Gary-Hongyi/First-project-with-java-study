package com.study;

import java.util.Scanner;

//关联 civil mechanical module
public class DynamicPolymorphism {
    public static void main(String[] args){

        //polymorphism = many shapes/forms
        //dynamic = after compilation(during runtime)

        //ex. A model3 is a: model3 ,a car,a vehicle,and an object
        Scanner scanner = new Scanner(System.in);
        Module module;// 目前是处于空指针状态，module是引用变量，持有对象的地址，但还没有指向任何对象，等待创建

        System.out.println("What animal do you want?");
        System.out.print("(1=Civil) or(2=Mechanical)");
        int choice = scanner.nextInt();

        if(choice == 1){
            module = new Civil();
            module.like();
        }
        else if(choice == 2){
            module = new Mechanical();
            module.like();
        }
        else{
            module = new Module();
            System.out.println("That choice was invalid");
            module.like();
        }
    }
}
