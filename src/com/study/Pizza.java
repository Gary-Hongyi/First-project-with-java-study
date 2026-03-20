package com.study;

public class Pizza extends Food {
    private String toppings;

    Pizza(String name, String toppings) {
        super(name);
        this.toppings = toppings;
    }

    void display() {
        System.out.println("Pizza: " + this.name + " with " + this.toppings);
    }
}