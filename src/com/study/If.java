package com.study;
//编程中的等于号为==
public class If {
    public static void main(String[] args){
        int age = 75;

        if(age>=90){
            System.out.println("You are an adult");//if 为真则忽略所有的else if
        }
        else if(age==75){
            System.out.println("Old people");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}
