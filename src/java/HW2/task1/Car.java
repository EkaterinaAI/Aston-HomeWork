package src.java.HW2.task1;

public abstract class Car implements Vehicle {

    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    //абстрактные методы
    public abstract int getNumberOfDoors();
    public abstract double getTrunkCapacity();

    //общая реализация методов интерфейса Vehicle для классов Sedan и Truck
    public void start() {
        System.out.println("Машина завелась");
    }
    public void stop() {
        System.out.println("Машина остановилась");
    }

    // реализация общего для всех наследуемых классов метода из интерфейса Vehicle
    @Override
    public String getFuelType() {
        return fuelType;
    };

}
