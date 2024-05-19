package src.java.HW2.task3;

public class Main {

    public static void main(String[] args) {

        //создание экземпляра вложенного статического класса
        Computer.Processor processor = new Computer.Processor("AMD");
        System.out.println(processor.getDetails());

        //создание экземпляра внутреннего класса, он имеет доступ к полям основного класса
        Computer computer = new Computer(8);
        Computer.Ram ram = computer.new Ram();
        //Computer.Ram ram1 = new Computer.Ram(); - 'src.java.HW2.task3.Computer' is not an enclosing class
        System.out.println(ram.getDetails());

    }
}
