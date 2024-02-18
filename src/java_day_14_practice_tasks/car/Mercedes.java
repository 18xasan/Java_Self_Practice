package java_day_14_practice_tasks.car;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String MODEL, int YEAR, double price, String color) {
        super("Mercedes", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("Mercedes started.");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes is auto parking.");
    }
}

