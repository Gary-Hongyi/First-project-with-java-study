package com.study;

public class ForLoop {
    public static void main(String[] args){
        // for loop = executes a block of code a limited amount of times( compare to while loop limitless)

        for(int i = 10; i>=0;i--){// for 的括号里面有三个条件，一直为真将重复循环直到为假
            System.out.println(i);
        }
        System.out.println("Happy new year！");
        for(int i = 10; i>=0;i-=2){
            System.out.println(i);
        }
    }
}
