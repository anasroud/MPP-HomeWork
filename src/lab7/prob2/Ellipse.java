package lab7.prob2;

public class Ellipse implements ClosedCurve {

    final private double a;
    final private double E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }

    @Override
    public double computePerimeter() {
        return a+E;
    }

}