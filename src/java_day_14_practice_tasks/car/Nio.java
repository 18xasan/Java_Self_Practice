package java_day_14_practice_tasks.car;

public class Nio extends Car implements AutoPilot {
    public Nio(String MODEL, int YEAR, double price, String color) {
        super("Nio", MODEL, YEAR, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is auto parking.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is self-driving.");
    }

    @Override
    public void start() {
        System.out.println("Nio started.");
    }

    @Override
    public void drive() {
        System.out.println("Nio is driving.");
    }
}
