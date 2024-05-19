package src.java.HW2.task1;

public class Sedan extends Car {

    private int numberOfDoors;
    private double trunkCapacity;
    private char luxuryLevel;

    public Sedan(String fuelType, int numberOfDoors, double trunkCapacity, char luxuryLevel) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
    }

    // реализация методов интерфейса Vehicle
    @Override
    public void start() {
        System.out.println("Седан завелся");
    };

    @Override
    public void stop() {
        System.out.println("Седан остановился");
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
    public char getLuxuryLevel() {
        return luxuryLevel;
    };
}
