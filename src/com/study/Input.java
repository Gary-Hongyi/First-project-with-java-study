package com.study;
import java.util.Scanner;
public class Input {

  public static void main(String[] args){

      Scanner scanner1 = new Scanner(System.in);

      System.out.println("what is your name?");
      String name = scanner1.nextLine();
      System.out.println("How old are you?");
      int age = scanner1.nextInt();//这行输入回车结束之后，scanner1 里面扫描的文字由18\n 变为 \n ,因为只提取int，如果下一行想用nextLine语法但是扫描框里有\n,程序就会认为已经提取结束了会报错
      scanner1.nextLine();// 所以使用单独一行有清理功能
      System.out.println("What is your favorite food?");
      String food = scanner1.nextLine();

      System.out.println("Hello\n" +name);
      System.out.println("Your are " +age+" years old");
      System.out.println("You favorite food is " + food);
  }




}
