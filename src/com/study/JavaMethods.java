package com.study;

public class JavaMethods {
    public static void main(String[] args){

        //method = a block of code that is executed whenever it is called upon
        //参数值由调用方传递给被调用的代码

        // void 是空的意思 有return的话，会返回给main做好的东西（厨师给配料做菜），没有的话，只是交给方法去做（交给厨师做菜，结果自己吃掉）
        String name = "Gary";
        int age = 18;
        //调用方法
        hello();
        hello();
        hello2(name,age);

        //以下展示 return 语句
        int x = 3;
        int y = 4;

        int z = add(x,y);
        System.out.println(z);
        //也可以直接 System.out.println(add(x,y));
    }

    //create a method     static void 方法名（）（小写）+括号
   static void hello(){
        System.out.println("Hello");
    }
    //可以往方法里面传递内容  内容类型 名字  这样方法就可以访问main里面的变量
    static void hello2(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age);

    }
    //以下展示return语句 不写void 而是写返回的数据类型
    static int add(int x, int y){    //为什么z可以用两次，因为其只是局部变量
        int z = x+y;
        return z;
        //或者直接 return x+y
    }



}
