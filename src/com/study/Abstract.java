package com.study;
//关联 Vehicle(父) Bike(子)
//有了abstract 是给编译器加安全锁，防止能运行但报错
//如果类前abstract 方法定义时的返回值前也要abstract
public class Abstract {
    public static void main(String[] args){

        //abstract = abstract classes cannot be instantiated(实例化), but they can have a subclass(子类)
        //           abstract methods(在父类中的) are declared without an implementation

        //Vehicle vehicle = new Vehicle();  Vehicle 太抽象了，我们不想有人创建，所以要去vehicle 这个class 里面增加abstract抽象声明
        Bike bike = new Bike();

        //在父类里面写 abstract method 如 abstract void go();  则所有的子类都必须包含这个method  注意！！！  用;而不是用{结尾    因为这个方法不用被填充

        bike.go();

    }
}
