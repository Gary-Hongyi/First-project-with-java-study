package com.study;

public class Friend {

    String name;
    //静态可用于变量
    static int numberOfFriends;
    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }
    //静态也可用于方法
    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + "Friends");
    }
    void hello(){
        System.out.println("Hello friends");
    }

}
