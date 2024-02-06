package java_day_12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item("Milk", 3.5, 2);
        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1);

    }
}
