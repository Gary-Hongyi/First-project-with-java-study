package com.study;
import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args){
        // nested loops = a loop inside of a loop 嵌套循环
        Scanner scanner = new Scanner(System.in);
        int rows;//行数
        int columns;//列数
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for(int i=1;i<=rows; i++){
            System.out.println();//始终记住 println 是执行完输入并换行的逻辑
            for(int j=1;j<=columns;j++){
               System.out.print(symbol);
            }
        }




    }
}
