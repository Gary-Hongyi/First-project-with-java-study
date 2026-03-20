package com.study;

public class Whale extends Animals {
    private int score;

    @Override
    void speak() {
        System.out.println("The whale is singing");
    }

    @Override
    void eat() {
        System.out.println("The zoomanager is feeding whale");
    }

    void bonus(int points) {
        this.score += points;
        System.out.println("Whale got " + points + " points! Total: " + score);
    }

    void praise() {
        System.out.println("What a wonderful whale!");
    }
}