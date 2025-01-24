package Lab7.prob4;

import Lab7.prob4.quack_behavior.QuackBehavior;
import Lab7.prob4.quack_behavior.Squeak;

public class RubberDuck extends Duck {
    private final QuackBehavior quackBehavior = new Squeak();
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println(" displaying");
    }
}
