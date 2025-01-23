package Lab5.codeprob2.prob2;

import Lab5.codeprob2.prob2.fly_behavior.FlyWithWings;
import Lab5.codeprob2.prob2.quack_behavior.Quack;

public class MallarDuck extends Duck {
    public MallarDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
    public void display() {
        System.out.println(" display");
    }
}
