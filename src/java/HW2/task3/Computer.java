package src.java.HW2.task3;

public class Computer {

    private int size;

    public Computer(int size) {
        this.size = size;
    }

    public static class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }
    }

    public class Ram {

        public int getDetails() {
            return size;
        }

    }
}
