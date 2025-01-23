package Lab5.codeprob2.prob2.quack_behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" cannot quack");
    }
}