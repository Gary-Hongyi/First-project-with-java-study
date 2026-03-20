package com.study;
//关联 Animal dog
public class MethodOverriding {

    public static void main(String[] args){
        // method overriding = declaring a method in sub class(子类),which has already present in parent class
        //done so that a child class can give its own implementation  让子类重写父类的方法
        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();

        //在重写的那个函数前面一行最好要加上 @Override 提醒读者
    }
}
