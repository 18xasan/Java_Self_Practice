package java_day_13_practice_tasks.employee;

public class Tester extends Employee {
    public Tester(String name, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing.");

    }
}
