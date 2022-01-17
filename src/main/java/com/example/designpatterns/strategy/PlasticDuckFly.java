package com.example.designpatterns.strategy;

public class PlasticDuckFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Plastic duck can't fly!");
    }
}
