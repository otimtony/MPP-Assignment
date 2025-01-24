package Lab7.prob4.fly_behavior;

public interface FlyBehavior {
    default void fly(){
        System.out.println(" cannot fly");
    };
}
