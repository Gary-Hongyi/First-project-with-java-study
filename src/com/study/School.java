package com.study;

public class School {
//建一个 方法，把Student 传递给 School
        void push(Student student){  // 把student这个class 当成一种数据类型
            //只能push Student 因为我们设置了Student 为我们这个方法调用的数据类型
        System.out.println("The " + student.name +" is pushed by the school");
    }
}
