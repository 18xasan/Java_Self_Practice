package java_day_14_practice_tasks.device;

public class Laptop extends Computer{
    public Laptop(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on laptop");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off laptop");
    }
}
