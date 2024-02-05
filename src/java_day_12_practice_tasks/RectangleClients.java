package java_day_12_practice_tasks;


public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 6);
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.calcPerimeter());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1);

        System.out.println();

        Rectangle rectangle2 = new Rectangle(6, 10);
        System.out.println(rectangle2.calcArea());
        System.out.println(rectangle2.calcPerimeter());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2);


    }
}
