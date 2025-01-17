package lesson3.labs.prob4;

public class Condo extends Property {
    private int numberOfFloors;

    public Condo(String address, int numberOfFloors) {
        super(address);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numberOfFloors;
    }
}
