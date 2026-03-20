package com.study;

/**
 * OOP (Object-Oriented Programming) 基础示例
 * 展示面向对象编程的核心概念：类、对象、继承、封装、多态
 */
public class OOP {
    public static void main(String[] args) {
        // 创建对象
        Human human1 = new Human("Alice", 25, 60.5);
        Human human2 = new Human("Bob", 30, 75.0);

        // 调用方法
        human1.eat();
        human2.drink();

        // 使用Car类
        Car car1 = new Car();
        System.out.println(car1);
        car1.drive();
        car1.brake();

        // 使用Animal类和继承
        Dog dog = new Dog();
        dog.speak(); // 方法重写

        // 使用多态
        Animal animal = new Dog(); // 向上转型
        animal.speak();
    }
}