package com.study;

public class Rabbit implements Prey{  //调用接口时要写 implements 接口名

    @Override
    public Prey flee() {//接口规定，只要写了类型（不是void）就必须有返回语句
        System.out.println("The rabbit is fleeing");
        return this;// this 指的是当前调用这个方法的对象
    }
}
