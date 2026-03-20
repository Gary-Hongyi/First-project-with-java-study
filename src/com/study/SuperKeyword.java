package com.study;
//关联 Person  SuperHero
public class SuperKeyword {
    public static void main(String[] args){
        // super =  keyword refers to the superclass(parent) of an object
        //   very similar to "this" keyword

        SuperHero hero1 = new SuperHero("Ironman",42,"$$$");

        System.out.println(hero1.age);
        System.out.println(hero1.name);
        System.out.println(hero1.power);

        System.out.println(hero1.toString());


    }
}
