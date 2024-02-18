package java_day_14_practice_tasks.device;

public class Google extends Phone implements Downloadable, AndroidApps {
    public Google( String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        super("Google", MODEL, price, color, SIZE, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Google phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Google phone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Google Play Store");
    }
}
