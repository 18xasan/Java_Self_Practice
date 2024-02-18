package java_day_14_practice_tasks.device;

public class PersonalComputer extends Computer {
    public PersonalComputer(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on personal computer");

    }

    @Override
    public void turnOff() {
        System.out.println("Turning off personal computer");

    }
}
