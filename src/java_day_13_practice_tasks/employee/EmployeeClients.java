package java_day_13_practice_tasks.employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Alex", "1234", "Tester", 123_456, "Apple");

        System.out.println(tester1.getName());
        System.out.println(tester1.getEmployeeId());
        System.out.println(tester1.getJobTitle());
        System.out.println(tester1.getSalary());
        System.out.println(tester1.getCompanyName());
        tester1.work();
        System.out.println(tester1);

        System.out.println();

        Developer developer1 = new Developer("Dima", "4567", "Developer", 233_554, "Samsung", "Java");

        System.out.println(developer1.getName());
        System.out.println(developer1.getEmployeeId());
        System.out.println(developer1.getJobTitle());
        System.out.println(developer1.getSalary());
        System.out.println(developer1.getCompanyName());
        System.out.println(developer1.getProgrammingLanguage());
        developer1.work();
        System.out.println(developer1);

        System.out.println();


        Teacher teacher1 = new Teacher("Michelle", "8649", "Teacher", 56_756, "CSI");

        System.out.println(teacher1.getName());
        System.out.println(teacher1.getEmployeeId());
        System.out.println(teacher1.getJobTitle());
        System.out.println(teacher1.getSalary());
        System.out.println(teacher1.getCompanyName());
        teacher1.work();
        System.out.println(teacher1);

        System.out.println();

        Driver driver1 = new Driver("Arthur", "7898", "Driver", 76_342, "Uber");

        System.out.println(driver1.getName());
        System.out.println(driver1.getEmployeeId());
        System.out.println(driver1.getJobTitle());
        System.out.println(driver1.getSalary());
        System.out.println(driver1.getCompanyName());
        driver1.work();
        System.out.println(driver1);


    }

}


