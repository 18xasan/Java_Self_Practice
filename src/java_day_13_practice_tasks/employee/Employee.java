package java_day_13_practice_tasks.employee;

public class Employee {

    private String name, employeeId, jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, String employeeId, String jobTitle, double salary, String companyName) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("The name must not be null, empty, or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank()) {
            System.err.println("The employee ID must not be null, empty, or blank.");
            System.exit(2);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("The job title must not be null, empty, or blank.");
            System.exit(3);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("The salary must be greater than zero.");
            System.exit(4);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isEmpty() || companyName.isBlank()) {
            System.err.println("The company name must not be null, empty, or blank.");
            System.exit(5);
        }
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName());

    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
