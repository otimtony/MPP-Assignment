package Lab7.prob4;

import Lab7.prob4.fly_behavior.FlyBehavior;
import Lab7.prob4.fly_behavior.FlyWithWings;
import Lab7.prob4.quack_behavior.Quack;
import Lab7.prob4.quack_behavior.QuackBehavior;

public class MallarDuck extends Duck {
    private final FlyBehavior flyBehavior = new FlyWithWings();
    private final QuackBehavior quackBehavior = new Quack();
    @Override
    public void fly() {
        flyBehavior.fly();
    }
    @Override
    public void quack() {
        quackBehavior.quack();
    }
    public void display() {
        System.out.println(" display");
    }
}
