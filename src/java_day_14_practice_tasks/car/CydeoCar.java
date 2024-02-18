package java_day_14_practice_tasks.car;

public class CydeoCar extends Car implements AutoPilot, Flyable {
    public CydeoCar(String MODEL, int YEAR, double price, String color) {
        super("CydeoCar", MODEL, YEAR, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar is auto parking.");
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar is self-driving.");
    }

    @Override
    public void start() {
        System.out.println("CydeoCar started.");
    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving.");
    }

    @Override
    public void fly() {
        System.out.println("CydeoCar is flying.");
    }
}
