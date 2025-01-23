package Lab5.codeprob2.prob2;

import Lab5.codeprob2.prob2.fly_behavior.CannotFly;
import Lab5.codeprob2.prob2.quack_behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        setQuackBehavior(new Squeak());
        setFlyBehavior(new CannotFly());
    }
    public void display() {
        System.out.println(" displaying");
    }
}
