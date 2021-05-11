package ClassesAndObjects.CarWithEngine;

public class Engine {
    private String name;
    private int horsePower;
    private int engineCubicCM;
    private boolean started;
    //*************************************************************************
    public Engine (String name, int horsePower, int engineCubicCM) {
        this.name = name;
        this.horsePower = horsePower;
        this.engineCubicCM = engineCubicCM;
        this.started = false;
    }
    //*************************************************************************
    public void start () {
        started = true;
        System.out.println("The engine is on.");
    }
    //*************************************************************************
    public void stop () {
        started = false;
        System.out.println("The engine is off.");
    }
    //*************************************************************************
    public int getMaximumSpeed () {
        return horsePower*2;
    }
    //*************************************************************************
    public double fuelConsumed (int distance) {
        double tankCapacity = engineCubicCM /1000.0;
        return tankCapacity*10;
    }
    //*************************************************************************
    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getEngineCubicCM() {
        return engineCubicCM;
    }

    public boolean isStarted() {
        return started;
    }

}