package vehicleComponents;

public class Engine implements IComponent{

    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String connect() {
        return "Connected";
    }
}
