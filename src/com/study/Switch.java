package com.study;
//switch = statement that allows a variable to be tested for equality against a list of values
public class Switch {
    public static void main(String[] args){
        String day = "Monday";
        switch(day){
            case "Sunday": System.out.println("It is Sunday");
            break;//很重要
            case "Monday":System.out.println("It is Sunday");
            break;
            case "Tuesday":System.out.println("It is Tuesday");
                break;
            default: System.out.println("That is not a day");//以防没有匹配的情况
        }
    }
}
//switch 可以解决很多重复的if语句问题