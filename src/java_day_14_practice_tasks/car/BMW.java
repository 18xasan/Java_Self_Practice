package java_day_14_practice_tasks.car;

public class BMW extends Car {

    public BMW(String MODEL, int YEAR, double price, String color) {
        super("BMW", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW started.");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving.");
    }
}
