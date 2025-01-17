package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Apartment> apartments;
    double maintenanceCost;
    double taxes;


    public Building(double taxes, double maintenanceCost) {
        this.taxes = taxes;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public double getProfit() {
        double profit = 0;
        for (Apartment apartment : apartments) {
            profit += apartment.getRent();
        }
        profit -= taxes + maintenanceCost;
        return profit;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    @Override
    public String toString() {
        return "Building [apartments=" + apartments + ", maintenanceCost=" + maintenanceCost + "]";
    }
}
