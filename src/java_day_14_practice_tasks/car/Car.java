package java_day_14_practice_tasks.car;

public abstract class Car {

    // encapsulated all the fields
    final private String MAKE;
    final private String MODEL;

    final private int YEAR;

    private double price;
    private String color;

    public Car(String MAKE, String MODEL, int YEAR, double price, String color) {

        if (MAKE == null || MAKE.isEmpty()) {
            throw new RuntimeException("Make cannot be null or empty.");
        }
        if (MODEL == null || MODEL.isEmpty()) {
            throw new RuntimeException("Model cannot be null or empty.");
        }
        if (YEAR < 1886) {
            throw new RuntimeException("Year must not be less than 1886.");
        }

        this.MAKE = MAKE;
        this.MODEL = MODEL;
        this.YEAR = YEAR;
        setPrice(price);
        setColor(color);
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(MAKE + " is stopping.");
    }


    public String getMAKE() {
        return MAKE;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getYEAR() {
        return YEAR;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price must not be negative.");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new RuntimeException("Color cannot be null or empty.");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return MAKE + "{" +
                "MODEL='" + MODEL + '\'' +
                ", YEAR=" + YEAR +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
