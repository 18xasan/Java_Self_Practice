package java_day_12_practice_tasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity <= 0) {
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("The price of candy cannot be set to a negative value.");
            System.exit(2);
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {

        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);

    }


    public String toString() {
        String price2 = (price == 0) ? "free" : "$" + price;
        return "Candy{" +
                " brand = '" + brand + '\'' +
                ", quantity = " + quantity +
                ", price = " + price2 +
                ", has peanuts = " + hasPeanuts +
                '}';
    }
}


/*
4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.

 */