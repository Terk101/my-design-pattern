package com.example.designpatterns.strategy;

public class MallardDuckFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Mallard duck can fly very fast!");
    }
}
