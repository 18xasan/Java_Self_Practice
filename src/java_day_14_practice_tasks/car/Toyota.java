package java_day_14_practice_tasks.car;

public class Toyota extends Car {
    public Toyota(String MODEL, int YEAR, double price, String color) {
        super("Toyota", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota started.");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving.");

    }
}
