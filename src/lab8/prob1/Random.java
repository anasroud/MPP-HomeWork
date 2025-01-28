package lab8.prob1;
import java.util.function.Supplier;

public class Random {

    // Inner class that implements Supplier<Double>
    class MathRandom implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        // class inner logic
        Random mathRandomInner = new Random();
        Random.MathRandom innerClass = mathRandomInner.new MathRandom();
        System.out.println("Inner class: " + innerClass.get());
    }
}
