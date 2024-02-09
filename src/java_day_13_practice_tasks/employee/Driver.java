package java_day_13_practice_tasks.employee;

public class Driver extends Employee {


    public Driver(String name, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    public void work() {
        System.out.println(getName() + " is driving.");
    }
}
