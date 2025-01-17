package lesson3.labs.Prob3.B;

public class Cylinder {
    double height;
    double radius;
    Circle baseCircle;

    Cylinder(double radius, double height) {
        this.height = height;
        baseCircle = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return baseCircle.getRadius();
    }

    public double computeVolume() {
        return Math.PI * baseCircle.getRadius() * baseCircle.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", radius=" + radius + "]";
    }
}
