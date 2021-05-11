package ClassesAndObjects.CarWithEngine;

import ClassesAndObjects.CarWithEngine.Engine;
import ClassesAndObjects.CarWithEngine.Car;


public class CarTester {
    public static void main(String[] args) {

//        var dieselEngine = new Engine("Diesel", 130, 2000);

        var vw = new Car();
        vw.setCarMakeAndModel("VW Golf");
        vw.setEngine("Diesel");
        vw.setFuelTankCapacity(50);
        vw.setRemainingFuel(50);

        var drive = String.format("Car %s can't be driven because the engine if off.",
                vw.getCarMakeAndModel());
        System.out.println(drive);

        var startEngine = String.format("Car %s is starting %1s engine.",
                vw.getCarMakeAndModel(),
                vw.getEngine());
        System.out.println(startEngine);

        var fuelCapacity = String.format("Car %s fuel status: %1s" + "/" + "%2s" + "L",
                vw.getCarMakeAndModel(),
                vw.getRemainingFuel(),
                vw.getFuelTankCapacity());
        System.out.println(fuelCapacity);
    }
}