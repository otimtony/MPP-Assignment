package Lab8.prob1.partB;
import java.util.function.Supplier;

public class RandomWithInner {
    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        RandomSupplier randomSupplier = new RandomSupplier();
        System.out.println("Random number: " + randomSupplier.get());
    }
}