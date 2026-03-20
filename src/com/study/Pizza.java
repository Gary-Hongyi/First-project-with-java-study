package com.study;

public class Pizza extends Food {
    public String topping;
    public String bread;
    public String sauce;
    public String cheese;

    Pizza(String bread, String sauce, String cheese, String topping) {
        super("pizza");
        this.topping = topping;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bread, String sauce, String topping) {
        super("pizza");
        this.topping = topping;
        this.bread = bread;
        this.sauce = sauce;
    }

}