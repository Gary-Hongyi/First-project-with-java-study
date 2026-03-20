package com.study;
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[]  args){
        //&& = (and) both conditions must be true
        //|| = (or) either condition must be true
        //! = (not)

        int temp = -2;
        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30 ){
            System.out.println("It is warm outside");
        }
        else{
            System.out .print("It is cold ouside");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();// next is to detect the next press

        if(response.equals("q") || response.equals("Q")){ //判断字符串是否一样时需要调用equals方法，基本格式为 A.equals(B)  数用==即可
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You still want play the game");
        }

        if(!response.equals("q") && !response.equals("Q")){ //这里用到了是! 不等号
            System.out.println("You still want to play the game");
        }
        else {
            System.out.println("You quit the game");
        }

    }
}
