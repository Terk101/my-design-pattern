package com.example.designpatterns.strategy;

import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    public void createMallardDuckTest() {
        QuackBehavior quackBehavior = new MallardDuckQuack();
        FlyBehavior flyBehavior = new MallardDuckFly();
        Duck duck = new MallardDuck(quackBehavior, flyBehavior);
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void createPlasticDuckTest() {
        Duck plasticDuck = new PlasticDuck();
        plasticDuck.setFlyBehavior(() -> System.out.println("Plastic duck can't fly!"));
        plasticDuck.setQuackBehavior(() -> System.out.println("Plastic duck can't Quack!"));
        plasticDuck.performQuack();
        plasticDuck.performFly();
    }
}
