package java_day_14_practice_tasks.device;

public class Desktop extends Computer{
    public Desktop(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on desktop");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off desktop");
    }
}
