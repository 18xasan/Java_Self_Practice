package java_day_14_practice_tasks.device;

public abstract class Computer extends Device {
    public Computer(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }
}
