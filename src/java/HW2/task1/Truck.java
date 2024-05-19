package src.java.HW2.task1;

public class Truck extends Car {

    private int numberOfDoors;
    private double trunkCapacity;
    private int maxLoadCapacity;

    public Truck(String fuelType, int numberOfDoors, double trunkCapacity, int maxLoadCapacity) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    // реализация методов интерфейса Vehicle
    @Override
    public void start() {
        System.out.println("Грузовик завелся");
    };

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    };

    // реализация абстрактных методов класса Car
    @Override
    public int getNumberOfDoors(){
        return numberOfDoors;
    };
    @Override
    public double getTrunkCapacity(){
        return trunkCapacity;
    };

    // реализация метода текущего класса
    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    };
}
