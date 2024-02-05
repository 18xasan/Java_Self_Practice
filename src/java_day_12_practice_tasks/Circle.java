package java_day_12_practice_tasks;

public class Circle {

    private int radius;

    public int getRadius() {
        if (radius <= 0) {
            System.err.println("Radius can not be negative or zero!");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            System.err.println("Radius can not be negative or zero!");
            System.exit(1);
        }

        this.radius = radius;
    }

    public Circle(int radius) {
        setRadius(radius);
    }

    public double calcArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public double calcPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}

/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

 */
