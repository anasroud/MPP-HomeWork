package lab5.prob3;

public final class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Width and length must be positive values.");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

