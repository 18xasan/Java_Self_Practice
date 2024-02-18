package java_day_14_practice_tasks.car;

public class Tesla extends Car implements AutoPilot {

    public Tesla(String MODEL, int YEAR, double price, String color) {
        super("Tesla", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("Tesla started.");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving.");
    }


    @Override
    public void autoPark() {
        System.out.println("Tesla is auto parking.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving.");
    }
}
