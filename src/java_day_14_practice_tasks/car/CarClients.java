package java_day_14_practice_tasks.car;

public class CarClients {

    public static void main(String[] args) {

        //    - Instantiate an object from each concrete class.
        Car toyota = new Toyota("Camry", 2022, 25000.0, "Red");
        Car honda = new Honda("Accord", 2023, 28000.0, "Blue");
        Car bmw = new BMW("X5", 2021, 60000.0, "Black");
        Car audi = new Audi("A6", 2022, 55000.0, "Silver");
        Car mercedes = new Mercedes("S-Class", 2023, 80000.0, "White");
        Car tesla = new Tesla("Model 3", 2024, 45000.0, "Gray");
        Car nio = new Nio("ES8", 2023, 70000.0, "Black");
        Car cydeoCar = new CydeoCar("CydeoFlyingCar", 2025, 150000.0, "Red");


        //    - Test all functions of each object.
        testCar(toyota);
        testCar(honda);
        testCar(bmw);
        testCar(audi);
        testCar(mercedes);
        testCar(tesla);
        testCar(nio);
        testCar(cydeoCar);

        System.out.println(bmw);


    }

    //    - Test all functions of each object.
    public static void testCar(Car car) {
        System.out.println("Testing " + car.getMAKE() + " " + car.getMODEL() + ":");
        car.start();
        car.drive();
        car.stop();
        if (car instanceof AutoPark) {
            AutoPark autoParkCar = (AutoPark) car;
            System.out.println("Has Auto Park: " + autoParkCar.hasAutoPark);
            autoParkCar.autoPark();
        }
        if (car instanceof AutoPilot) {
            AutoPilot autoPilotCar = (AutoPilot) car;
            System.out.println("Has Auto Pilot: " + autoPilotCar.hasAutoPilot);
            autoPilotCar.selfDrive();
        }
        if (car instanceof Flyable) {
            Flyable flyableCar = (Flyable) car;
            System.out.println("Can Fly: " + flyableCar.canFly);
            flyableCar.fly();
        }
        System.out.println();
    }
}
