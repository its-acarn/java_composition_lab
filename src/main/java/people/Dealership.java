package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }
}
