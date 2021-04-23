package ClassesAndObjects;

import ClassesAndObjects.CarWithEngine.Engine;
import ClassesAndObjects.CarWithEngine.Car;


public class CarTester {
    public static void main(String[] args) {

        var dieselEngine = new Engine("Diesel", 130, 2000);

        var vw = new Car();
        vw.setName("VW Golf");
        vw.setEngine("Diesel");
        vw.setFuelTankCapacity(50);


        var drive = String.format("Car %s can't be driven because the engine if off.",
                vw.getName());
        System.out.println(drive);

        var startEngine = String.format("Car %s is starting %s engine.",
                vw.getName(),
                vw.getEngine());
        System.out.println(startEngine);
    }
}