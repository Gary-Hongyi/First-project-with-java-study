package com.study;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){
        // for-each loop  or powerful for loop
        // less steps readable but less flexible

        String[] animals = {"cat","rat","dog","fish"};

        for(String i : animals){ //标准格式  类型 i : 数组名
            System.out.println(i);
        }

        ArrayList<String> Animals = new ArrayList<String>();

        Animals.add("cat");
        Animals.add("rat");
        Animals.add("bird");
        Animals.add("dog");

        for(String i : Animals){
            System.out.println(i);
        }
    }
}
