package Lab7.prob4;

import Lab7.prob4.fly_behavior.FlyBehavior;
import Lab7.prob4.quack_behavior.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    void swim() {
        System.out.println(" swimming");
    }
    abstract void display();
}
