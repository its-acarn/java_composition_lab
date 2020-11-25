package vehicleComponents;

public class Seats implements IComponent{

    private int numberOfSeats;

    public Seats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String connect() {
        return "Connected";
    }
}
