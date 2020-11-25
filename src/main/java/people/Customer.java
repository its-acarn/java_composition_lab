package people;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {


    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getOwnedVehicles() {
        return this.ownedVehicles.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
        this.ownedVehicles.add(vehicle);

    }
}
