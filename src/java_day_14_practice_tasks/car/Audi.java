package java_day_14_practice_tasks.car;

public class Audi extends Car implements AutoPark {
    public Audi(String MODEL, int YEAR, double price, String color) {
        super("Audi", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("Audi started.");
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Audi is auto parking.");
    }
}
