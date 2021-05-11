package ClassesAndObjects.CarWithEngine;

public class Car {
    private String carMakeAndModel;
    public String getCarMakeAndModel() {return carMakeAndModel;}
    public void setCarMakeAndModel(String make) {this.carMakeAndModel = make;}

    private String engine;
    public String getEngine() {return engine;}
    public void setEngine(String engine) {this.engine = engine;}

//*************************************************************************
    private int fuelTankCapacity;

    public int getFuelTankCapacity() {return fuelTankCapacity;}
    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

//*************************************************************************
    private int remainingFuel;

    public int getRemainingFuel() {return remainingFuel;}
    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
}