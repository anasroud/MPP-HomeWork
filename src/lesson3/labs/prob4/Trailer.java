package lesson3.labs.prob4;

public class Trailer extends Property{
    private String trailerParkAddress;

    public Trailer(String address, String trailerParkAddress) {
        super(address);
        this.trailerParkAddress = trailerParkAddress;
    }

    @Override
    public double computeRent() {
        return 500;
    }
}
