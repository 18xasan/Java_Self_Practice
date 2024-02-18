package java_day_14_practice_tasks.device;

public abstract class Phone extends Device {


    public Phone(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum);
    }

}
