package ClassesAndObjects.CarWithEngine;

public class Engine {
    private String name;
    private int horsePower;
    private int capacity;
    private boolean started;

    public Engine (String name, int horsePower, int capacity) {
        this.name = name;
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.started = false;
    }

    public void start () {
        started = true;
    }
    public void stop () {
        started = false;
    }
    public int getMaximumSpeed () {
        return horsePower*2;
    }
    public double fuelConsumed (int distance) {
        double capacityLiters = capacity/1000.0;
        return capacityLiters*10;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isStarted() {
        return started;
    }

}