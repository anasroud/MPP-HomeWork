package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    List<Building> buildings;

    LandlordInfo() {
        this.buildings = new ArrayList<>();
    }

    public double calcProfits() {
        double profit = 0;
        for (Building building : buildings) {
            profit += building.getProfit();
        }
        return profit;
    }


    public void addBuilding(Building building) {
        buildings.add(building);
    }

    @Override
    public String toString() {
        return "LandlordInfo [buildings=" + buildings + "]";
    }

}
