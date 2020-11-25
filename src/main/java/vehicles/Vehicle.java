package vehicles;

import vehicleComponents.IComponent;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;
import vehicleComponents.Engine;

import java.util.ArrayList;

public abstract class Vehicle {

//    private Engine engine;
//    private Tyres tyres;
//    private Seats seats;
    private ArrayList<IComponent> vehicleComponents;
    private String make;
    private String model;
    private double price;
    private String colour;
    private double damage;

    public Vehicle(String make, String model, double price, String colour, double damage) {
//        this.engine = engine;
//        this.tyres = tyres;
//        this.seats = seats;
        this.vehicleComponents = new ArrayList<>();
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

//    public Engine getEngine() {
//        return engine;
//    }
//
//    public Tyres getTyres() {
//        return tyres;
//    }
//
//    public Seats getSeats() {
//        return seats;
//    }


    public int getVehicleComponents() {
        return vehicleComponents.size();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void addDamage(double damage) {
        this.damage += damage;
        this.price -= damage;
    }
}
