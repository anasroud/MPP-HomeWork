package lesson3.labs.prob2;

public class Apartment {
    double rent;

    public Apartment(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Apartment [rent=" + rent + "]";
    }
}
