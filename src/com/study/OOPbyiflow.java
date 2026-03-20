package com.study;

import java.util.ArrayList;

/**
 * 动物园测试类 - 展示继承、多态、封装等OOP概念
 * 关联类：ZooManager, Animals, Lion, Good, Bad, Whale, Crow
 */
public class OOPbyiflow {
    public static void main(String[] args) {
        // 1. 创建动物园集合（使用钻石操作符简化泛型声明）
        ArrayList<Animals> myZoo = new ArrayList<>();

        // 2. 创建动物实例
        Lion lion = new Lion();
        Whale whale = new Whale();
        Crow crow = new Crow();

        // 3. 将动物添加到动物园
        myZoo.add(lion);
        myZoo.add(whale);
        myZoo.add(crow);

        // 4. 创建动物园管理员
        ZooManager zooManager = new ZooManager();

        // ========== 展示继承的信息 ==========
        System.out.println("=== 继承信息展示 ===");
        System.out.println("狮子名称: " + lion.name);
        System.out.println("乌鸦年龄: " + crow.age);

        // ========== 调用个别的方法（狮子） ==========
        System.out.println("\n=== 狮子的行为 ===");
        lion.speak();
        lion.hunt();
        lion.push();

        // ========== 调用个别的方法（鲸鱼） ==========
        System.out.println("\n=== 鲸鱼的行为 ===");
        whale.bonus(35);
        whale.bonus(9);
        whale.praise();

        // ========== 调用个别的方法（乌鸦） ==========
        System.out.println("\n=== 乌鸦的行为 ===");
        crow.curse();
        crow.push();

        // ========== 通过封装，管理员执行任务 ==========
        System.out.println("\n=== 管理员任务 ===");
        zooManager.setZoo(myZoo);
        zooManager.feed();
        zooManager.train();
    }
}