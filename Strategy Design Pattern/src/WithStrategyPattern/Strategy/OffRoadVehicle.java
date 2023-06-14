package WithStrategyPattern.Strategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
