package java_day_14_practice_tasks.device;

public class DeviceShop {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("iPhone 13", 999.99, "Black", "6.1", true, true);
        Samsung samsung = new Samsung("Galaxy S21", 899.99, "Blue", "6.2", true, true);
        Google google = new Google("Pixel 6", 799.99, "White", "6.4", true, true);
        Desktop desktop = new Desktop("Dell", "Inspiron", 699.99, "Silver", "21", false, true);
        Laptop laptop = new Laptop("HP", "Pavilion", 799.99, "Black", "15", true, true);


        iphone.turnOn();
        iphone.call(1234567890);
        iphone.text(1234567890);
        iphone.downloadApp();
        System.out.println(iphone);

        samsung.turnOn();
        samsung.call(9876543210L);
        samsung.text(9876543210L);
        samsung.downloadApp();
        System.out.println(samsung);

        google.turnOn();
        google.call(5555555555L);
        google.text(5555555555L);
        google.downloadApp();
        System.out.println(google);

        desktop.turnOn();
        System.out.println(desktop);

        laptop.turnOn();
        System.out.println(laptop);
    }

}