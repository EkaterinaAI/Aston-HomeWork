package src.java.HW2.task1;

public class Main {

    public static void main(String[] args) {

        Sedan sedan = new Sedan("95 бензин", 4, 20.2, 'F');
        Truck truck = new Truck("дизель",2, 1560.3, 200);

        sedan.start();
        System.out.println(sedan.getFuelType());
        System.out.println(sedan.getNumberOfDoors());
        System.out.println(sedan.getTrunkCapacity());
        System.out.println(sedan.getLuxuryLevel());
        sedan.stop();

        System.out.println("--------------------------------");

        truck.start();
        System.out.println(truck.getFuelType());
        System.out.println(truck.getNumberOfDoors());
        System.out.println(truck.getTrunkCapacity());
        System.out.println(truck.getMaxLoadCapacity());
        truck.stop();
    }
}
