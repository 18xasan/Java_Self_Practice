package java_day_14_practice_tasks.device;

public class Samsung extends Phone implements Downloadable, AndroidApps {


    public Samsung(String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super("SAMSUNG", MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Samsung phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Samsung phone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Google Play Store");
    }
}
