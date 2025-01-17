package lesson3.labs.prob4;

abstract class Property {
    private String address;

    public Property(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Abstract method for computing rent
    public abstract double computeRent();
}
