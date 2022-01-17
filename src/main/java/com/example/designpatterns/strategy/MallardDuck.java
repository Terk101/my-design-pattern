package com.example.designpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
}
