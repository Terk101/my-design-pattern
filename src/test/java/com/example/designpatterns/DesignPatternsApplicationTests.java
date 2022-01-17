package com.example.designpatterns;

import com.example.designpatterns.strategy.FlyBehavior;
import com.example.designpatterns.strategy.MallardDuck;
import com.example.designpatterns.strategy.MallardDuckQuack;
import com.example.designpatterns.strategy.QuackBehavior;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternsApplicationTests {

	@Test
	void contextLoads() {
		QuackBehavior quackBehavior = new MallardDuckQuack();
		FlyBehavior flyBehavior = () -> System.out.println("Mallard Duck fly very fast!");
		MallardDuck mallardDuck = new MallardDuck(quackBehavior, flyBehavior);
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}

}
