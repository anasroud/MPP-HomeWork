package lab5.prob3;

public final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive value.");
        }
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
