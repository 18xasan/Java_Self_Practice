package java_day_13_practice_tasks.phone;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iphone11 = new IPhone("Apple", "iPhone 11", "6.1 inches", 999, "Green");

        System.out.println(iphone11.getBrand());
        System.out.println(iphone11.getModel());
        System.out.println(iphone11.getSize());
        System.out.println(iphone11.getPrice());
        System.out.println(iphone11.getColor());
        System.out.println(iphone11);

        iphone11.call(1234567);
        iphone11.text(1234567);
        iphone11.faceTime(1234567); // how to make facetime only for iphone, so samsung and nokia would not be able to call it

        System.out.println();

        Samsung samsung20 = new Samsung("Samsung", "Galaxy 20S", "6.9 inches", 1199, "Black");

        System.out.println(samsung20.getBrand());
        System.out.println(samsung20.getModel());
        System.out.println(samsung20.getSize());
        System.out.println(samsung20.getPrice());
        System.out.println(samsung20.getColor());
        System.out.println(samsung20);

        samsung20.call(1234567);
        samsung20.text(1234567);

        System.out.println();

        Nokia nokiaG10 = new Nokia("Nokia", "Nokia G10", "4.4 inches", 549, "Grey");

        System.out.println(nokiaG10.getBrand());
        System.out.println(nokiaG10.getModel());
        System.out.println(nokiaG10.getSize());
        System.out.println(nokiaG10.getPrice());
        System.out.println(nokiaG10.getColor());
        System.out.println(nokiaG10);

        nokiaG10.call(1234567);
        nokiaG10.text(1234567);

    }

}
