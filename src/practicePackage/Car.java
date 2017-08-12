package practicePackage;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // gear automatically start at 1
    public void changeGear(int velocity){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int velocity, int direction){
        move(velocity, direction);
        System.out.println("Car.changeVelocity(): Velocity at " + velocity + " direction at " + direction + " degrees.");
    }

}
