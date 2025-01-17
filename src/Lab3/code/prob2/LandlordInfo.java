package Lab3.code.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private Building[] buildings;
    private int buildingCount;

    public LandlordInfo() {
        this.buildings = new Building[10]; // Assuming a maximum of 10 buildings
        this.buildingCount = 0;
    }

    public void addBuilding(Building building) {
        if (buildingCount < buildings.length) {
            buildings[buildingCount++] = building;
        }
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (int i = 0; i < buildingCount; i++) {
            totalProfit += buildings[i].getProfit();
        }
        return totalProfit;
    }
}
