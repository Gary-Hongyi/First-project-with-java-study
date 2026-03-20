package com.study;
/*📚 练习题一：简易图形面积计算器（基础）
题目背景
你需要为一个绘图软件开发一个模块，用于计算各种几何图形的面积。
功能需求
支持三种图形：圆形、矩形、三角形
计算总面积：能够批量计算多个图形的面积总和
信息展示：每个图形能打印自己的类型和面积
        技术要求
表格
OOP特征	具体要求
抽象	定义一个抽象类表示"图形"，其中计算面积的方法没有具体实现
封装	每个图形的属性（如半径、边长）必须私有，通过构造函数传入，不提供公开修改方法
继承	三种具体图形都继承自上述抽象类
多态	使用抽象类类型的集合存储所有图形对象，遍历时调用计算方法*/

//关联 Shape Circle Triangle Rectangle
public class OOPTest1 {



    public static void main(String[] args){
        Circle circle = new Circle(91);
        Triangle triangle = new Triangle(23,24);
        Rectangle rectangle = new Rectangle(6,9);
        Shape[] figures = {circle,triangle,rectangle};
        for(Shape x: figures){
            System.out.println(x.calculate());
        }
        System.out.println("面积的总和为"+sum(figures));
    }

    public static double sum(Shape[] shapes){//传递一个数组类型的值
        double sum =0;
        for(Shape x: shapes){
            sum += x.calculate();
        }
        return sum;
    }




}
