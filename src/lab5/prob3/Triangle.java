package lab5.prob3;

public final class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive values.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
