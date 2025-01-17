package Lab3.code.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Apartment[] apartments;
    private double maintenanceCost;
    private int apartmentCount;

    public Building(int maxApartments, double maintenanceCost) {
        this.apartments = new Apartment[maxApartments];
        this.maintenanceCost = maintenanceCost;
        this.apartmentCount = 0;
    }

    public void addApartment(Apartment apartment) {
        if (apartmentCount < apartments.length) {
            apartments[apartmentCount++] = apartment;
        }
    }
    public double getProfit() {
        int totalRent = 0;
        for (Apartment apt : apartments) {
            if (apt != null) {
                totalRent += apt.getRent();
            }
        }
        return totalRent - maintenanceCost;
    }

}
