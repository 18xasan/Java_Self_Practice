package java_day_14_practice_tasks.device;

public class Iphone extends Phone implements Downloadable, AppleStore {
    public Iphone(String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {
        System.out.println("Turning on iPhone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off iPhone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from App Store");
    }
}
