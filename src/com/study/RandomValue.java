package com.study;
import java.util.Random;//util  utility(工具/实用程序)的简写
public class RandomValue {
    public static void main(String[] args){
        Random random = new Random();//命名random的方式显然很类似于scanner

        int x = random.nextInt();
        System.out.println(x);
        int y = random.nextInt(6)+1;//假设去丢6面的骰子，计算机总是从0开始
        System.out.println(y);
        double z = random.nextDouble();//输出0-1之间小数
        System.out.println(z);
        boolean p = random.nextBoolean();
        System.out.println(p);

    }
}
