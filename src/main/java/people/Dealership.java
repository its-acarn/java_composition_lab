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

    public int getStock() {
        return stock.size();
    }

    public double getTill() {
        return till;
    }

    public void buyVehicle (Vehicle vehicle) {
        this.till -= vehicle.getPrice();
        this.stock.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        this.till += vehicle.getPrice();
        this.stock.remove(vehicle);
        customer.buyVehicle(vehicle);
    }

    public void repair(Vehicle vehicle) {
        vehicle.setPrice(vehicle.getPrice() + vehicle.getDamage());
        vehicle.setDamage(0);
    }
}
