package java_day_14_practice_tasks.car_shop;

import java_day_14_practice_tasks.car.Audi;
import java_day_14_practice_tasks.car.Car;
import java_day_14_practice_tasks.car.Honda;
import java_day_14_practice_tasks.car.Tesla;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue"),
        };

        System.out.println("Cars eligible for recall:");
        for (Car car : cars) {
            if (car instanceof Honda && car.getYEAR() >= 2010 && car.getYEAR() <= 2011) {
                System.out.println(car);
            } else if (car instanceof Audi && car.getYEAR() >= 2015 && car.getYEAR() <= 2019) {
                System.out.println(car);
            } else if (car instanceof Tesla && car.getYEAR() >= 2015 && car.getYEAR() <= 2016) {
                System.out.println(car);
            }
        }
        System.out.println();
        Car highestPriceCar = cars[0];
        for (Car car : cars) {
            if (car.getPrice() > highestPriceCar.getPrice()) {
                highestPriceCar = car;
            }
        }
        System.out.println("Car with the highest price:");
        System.out.println(highestPriceCar);

        System.out.println();
        Car lowestPriceCar = cars[0];
        for (Car car : cars) {
            if (car.getPrice() < lowestPriceCar.getPrice()) {
                lowestPriceCar = car;
            }
        }
        System.out.println("Car with the lowest price:");
        System.out.println(lowestPriceCar + "\n");

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof Tesla) {
                teslaCars.add((Tesla) car);
            }
        }
        System.out.println("Tesla cars:");
        for (Tesla car : teslaCars) {
            System.out.println(car);
        }
    }
}

