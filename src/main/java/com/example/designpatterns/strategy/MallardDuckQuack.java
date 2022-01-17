package com.example.designpatterns.strategy;

public class MallardDuckQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mallard duck can quack very loud!");
    }
}
