package lesson3.labs.Prob3.A;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.computeArea());
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Height: " + circle.getHeight());
    }
}


