package vehicleComponents;

public class Tyres implements IComponent {

    private int numberOfTyres;

    public Tyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    @Override
    public String connect() {
        return "Connected";
    }
}
