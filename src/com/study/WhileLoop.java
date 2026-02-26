package com.study;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){    //只要条件为真就一直停留在这个循环之中
            System.out.println("Enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
