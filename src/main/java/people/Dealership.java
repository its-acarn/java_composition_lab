package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }
}
