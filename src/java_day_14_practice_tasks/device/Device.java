package java_day_14_practice_tasks.device;

public abstract class Device {
    final private String BRAND;
    final private String MODEL;
    private double price;
    private String color;
    final private String SIZE;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String BRAND, String MODEL, double price, String color, String SIZE, boolean hasBattery, boolean hasPowerButton) {
        if (BRAND == null || BRAND.isEmpty()) {
            throw new RuntimeException("Brand cannot be null or empty.");
        }
        if (MODEL == null || MODEL.isEmpty()) {
            throw new RuntimeException("Model cannot be null or empty.");
        }
        if (SIZE == null || SIZE.isEmpty()) {
            throw new RuntimeException("Size cannot be null or empty.");
        }


        this.BRAND = BRAND;
        this.MODEL = MODEL;
        setPrice(price);
        setColor(color);
        this.SIZE = SIZE;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price must be positive.");
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

    public String getSIZE() {
        return SIZE;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "BRAND='" + BRAND + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", SIZE='" + SIZE + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
