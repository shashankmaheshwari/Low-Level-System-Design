package WithStrategyPattern.Strategy;

public class Vehicle {

    DriveStrategy driveObject;

    // constructor based injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}
