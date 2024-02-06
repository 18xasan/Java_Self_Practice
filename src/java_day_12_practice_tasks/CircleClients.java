package java_day_12_practice_tasks;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(7);
        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1.calcArea());

        System.out.println();

        Circle circle2 = new Circle(3);
        System.out.println(circle2);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.calcPerimeter());
        System.out.println(circle2.calcArea());


    }
}
