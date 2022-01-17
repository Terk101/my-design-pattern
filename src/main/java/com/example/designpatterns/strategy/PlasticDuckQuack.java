package com.example.designpatterns.strategy;

public class PlasticDuckQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Plastic duck can't quack!");
    }
}
