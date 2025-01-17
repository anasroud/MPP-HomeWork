package lesson3.labs.Prob3.A;

public class Cylinder {
    double height;
    double radius;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", radius=" + radius + "]";
    }
}
