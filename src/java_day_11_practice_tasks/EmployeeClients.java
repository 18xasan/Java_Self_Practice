package java_day_11_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Bella", 32);
        System.out.println(employee1);

        System.out.println();

        Employee employee2 = new Employee("Arthur", 28, "Developer", 'M');
        System.out.println(employee2);
        System.out.println(employee2.work());

        System.out.println();

        Employee employee3 = new Employee("Alex", 36, "Doctor", 'M',181_054.17);
        System.out.println(employee3);
        System.out.println(employee3.work());


    }
}
