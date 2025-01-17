package lesson3.labs.Prob3.A;

/**
 * it doesn't make sense to have a circle class that extends a cylinder class
 * because a circle is not a cylinder. A cylinder is a 3D object that has a
 * circle as its base. A circle is a 2D object that has a radius and an area.
 */
public class Circle extends Cylinder{
    public Circle(double radius) {
        super(radius, 0);
    }
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
