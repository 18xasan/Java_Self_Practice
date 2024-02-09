package java_day_13_practice_tasks.employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String employeeId, String jobTitle, double salary, String companyName,
                     String programmingLanguage) {
        super(name, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("The programming language must not be null, empty, or blank.");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage + ".");
    }

}
