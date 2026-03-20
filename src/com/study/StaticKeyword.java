package com.study;
//关联Friend
public class StaticKeyword {
    public static void main(String[] args){
        //static = modifier. A single copy of a variable/method is created and shared

        Friend friend1 = new Friend("Gary");
        Friend friend2 = new Friend("Jack");
        Friend friend3 = new Friend("Jasper"); //每创造一次都会去freind 里面 +1
        System.out.println(Friend.numberOfFriends);// 静态变量和方法都属于类class
        System.out.println(friend1.numberOfFriends);//不推荐 如果删去static 才只能这样单个对象访问

        Friend.displayFriends();
        friend1.displayFriends();// 不管是否static 访问其他类的方法都要加类名/对象名

        friend1.hello();  //  访问其他类都是  类名/对象名.方法()

        //类名经常用来访问静态static的，属于一整个类的方法和参数
    }
}
