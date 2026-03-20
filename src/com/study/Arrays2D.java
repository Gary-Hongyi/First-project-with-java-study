package com.study;

public class Arrays2D {
    public static void main(String[] args) {
        //2D数组 命名法一
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";  //数组名[行][列]
        cars[0][1] = "Camao";
        cars[0][2] = "Camar";
        cars[1][0] = "Camro";
        cars[1][1] = "Caaro";
        cars[1][2] = "Cmaro";
        cars[2][0] = "Cam";
        cars[2][1] = "Cro";
        cars[2][2] = "Cmo";

        for(int i=0;i<cars.length;i++){//二维数组，数组名.length 行数  cars[1].length 第一行的列数
            System.out.println();//应该是每一个横行执行完换行
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");// " "才是一个包含空格的字符串
            }
        }

        //2D数组命名方法2  最外面用大括号包裹起来，用逗号来分隔每行
        String[][] heros = {{"Curry" , "Durant", "James"},{"Gary", "Rose", "Harden"},{"Baby", "Chestnut"}};
        for(int i=0;i<heros.length;i++){//二维数组，数组名.length 行数  cars[1].length 第一行的列数
            System.out.println();//应该是每一个横行执行完换行
            for(int j=0;j<heros[i].length;j++){
                System.out.print(heros[i][j]+" ");// " "才是一个包含空格的字符串
            }
        }
    }
}