package ClassesAndObjects.CarWithEngine;

public class Car {
    private String name;
    private Engine engine;
    private int fuelTankCapacity;
    private int remainingFuelAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return getName();
    }

    public void setEngine(String engine) {

    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getRemainingFuelAmount() {
        return remainingFuelAmount;
    }

    public void setRemainingFuelAmount(int remainingFuelAmount) {
        this.remainingFuelAmount = remainingFuelAmount;
    }
}