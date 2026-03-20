package com.study;

public class Human {
//这是全局变量，一定要加
      String name;
      int age;
      double weight;

    Human(String name, int age, double weight){// 括号里写的这些是要在main里面被调用的      //class 类和constructor函数的名字一定要一样
// 外部赋值给类内部的值    局部变量，函数结束就消失了
        //通过这样定义函数，不只能造一种车，可以定制化生产，有不同属性
        this.name = name; //这里的this.name 只是临时的，后面的name 相当于合同，等待填写
        this.age = age;
        this.weight = weight;
    }
    //方法执行时输出内容不同，这也是定制化的行为
    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }
}
