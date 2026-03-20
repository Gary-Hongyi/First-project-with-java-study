package com.study;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHanding {
    public static void main(String[] args){

        //exception = an event that occurs during the execution of a program that ,//执行时的事故
        //            disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
    try {//把可能出错的代码比如除以0放try里

        System.out.println("Enter a whole number to devide:");
        int x = scanner.nextInt();
        System.out.println("Enter a whole number to devide by:");
        int y = scanner.nextInt();
        int z = x / y;

        System.out.println("result:" + z);
    }
    catch(ArithmeticException e){//对出错后进行code  //语法是 catch(exceptiontype variable name) //java.lang包里的不用导入
        System.out.println("You can't devide by 0, IDIOT");
    }
    catch(InputMismatchException e){ //可以在报错后查看这个是什么exceptiontype //这个要导入
        System.out.println("Please enter a number OMFG");
    }
    catch(Exception e){// 这个啥都可捕获，不过最好单个单个处理，这个用来以防万一
        System.out.println("Something went wrong");
    }

    finally{// 不管是否捕获，finally都会执行
        System.out.println("This will always print");
        scanner.close(); //不管打开了什么最后都关闭是很好的习惯
    }


    }
}
