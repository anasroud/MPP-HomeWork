package lab8.prob1;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> mathRandomLambda = () -> Math.random();
        System.out.println(mathRandomLambda.get());
    }
}
