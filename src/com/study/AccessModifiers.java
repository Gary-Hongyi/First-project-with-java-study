package com.study;
//关联 package1(A B ) package2( C Asub(A的子类))

// 继承别的包的import 语法
// import 包名.类名
//import 包名.* //继承所有
// 任何 public 是对其他包可见的
// 局部变量比如在mian 里面不能有修饰符 public protected private 这三个是用于控制访问权限的，写在这里只对局部方法有效，没意义
//protected 对同包和不同包的子类都可以访问
//private 只有本class可以访问，即使是在同个包中
public class AccessModifiers {
    public static void main(String[] args){

    }
}
