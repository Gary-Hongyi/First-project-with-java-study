package com.study;
//关联 Student ,School
public class ObjectPassing {
    // pass objects as parameters to the methods

    // aim send some students to the school
    public static void main(String args[]){
        Student student1 = new Student("Gary");
        Student student2 = new Student("Jack");
        School FAYZ = new School();

        FAYZ.push(student1);
        FAYZ.push(student2);
    }
}
