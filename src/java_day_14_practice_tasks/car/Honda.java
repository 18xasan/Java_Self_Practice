package java_day_14_practice_tasks.car;

public class Honda extends Car {

    public Honda(String MODEL, int YEAR, double price, String color) {
        super("Honda", MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda started.");
    }

    @Override
    public void drive() {
        System.out.println("Honda is driving.");
    }


}
