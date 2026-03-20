package com.study;
// 关联DiceRoller
public class VariableScope {
    public static void main(String[] args){
        //local = declared inside a method   visible only to that method

        //global = declared outside a method, but within a class   visible to all parts of a class

        DiceRoller diceroller = new DiceRoller();//还是在创建类下的一个对象

    }

}
