package com.study;

public class Fish implements Prey,Predator {

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public Prey flee() {
        System.out.println("This fish is fleeing from a larger fish");
        return this;
    }
}
