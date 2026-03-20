package com.study;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){ // 广义上 constructor 和 toString method 都是方法，所以只能并列写
        return this.name + "\n" + this.age +"\n";
    }
}
