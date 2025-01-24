package Lab7.prob4.quack_behavior;

public interface QuackBehavior {
    default public void quack(){
        System.out.println(" cannot quack"); // MuteQuack
    }
}
