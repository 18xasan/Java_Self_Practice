package java_day_12_practice_tasks;

public class CandyClients {

    public static void main(String[] args) {


        Candy candy1 = new Candy("Milka", 3, 0, false);
        System.out.println(candy1.getBrand());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanuts());
        System.out.println(candy1);

        System.out.println();

        Candy candy2 = new Candy("Kit-Kat", 2, 1.5, true);
        System.out.println(candy2);


    }
}
