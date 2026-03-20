package com.study;
import java.util.Random;
public class DiceRoller {

      DiceRoller(){
            Random random1 = new Random();//Random 是需要Import的
            int number = 0;
             //roll();
            roll(random1,number);  //  构造/普通方法之间相互调用也是很正常的事 如我给你打电话发消息，你给我打电话发消息

      }
// constructors 相当于methods  number 在 roll 这个methods 中不可见
/*void roll(){
    number = number.nextInt(6)+1;
    System.out.println(number);*/

    void roll(Random random, int number){ //Random 也是一个引用数据类型
        // 这里的random 是形参  引用实参 random1 的值  相当于小明和张工
        number = random.nextInt(6)+1;
        System.out.println(number);
}

}
