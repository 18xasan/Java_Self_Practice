package java_day_13_practice_tasks.employee;

public class Teacher extends Employee {


    public Teacher(String name, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    public void work() {
        System.out.println(getName() + " is teaching.");
    }
}
