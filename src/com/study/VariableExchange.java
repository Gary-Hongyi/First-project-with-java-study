package com.study;

public class VariableExchange {
    public static void main(String[] args){
       String x ="water";
       String y = "salt";
       System.out.println("x:"+x );
       System.out.println("y:"+y );
       String temp;
       temp = x;
       x = y;
       y = temp;
        System.out.println("x:"+x );
        System.out.println("y:"+y );


    }

}
