package java_day_11_practice_tasks;

public class CydeoStudent {

    public String name, batchNumber;
    public int age, id, groupNumber;
    public char grade;
    public static String schoolName = "Cydeo", programmingLanguage = "Java";

    public CydeoStudent(String name, String batchNumber, int age, int id, int groupNumber, char grade) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.id = id;
        this.groupNumber = groupNumber;
        this.grade = grade;

    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending the live class.");
    }

    public void printSchoolName() {
        System.out.println("schoolName = " + schoolName);
    }

    public void printProgLanguage() {
        System.out.println("programmingLanguage = " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name= '" + name + '\'' +
                ", batchNumber= '" + batchNumber + '\'' +
                ", age= " + age +
                ", id= " + id +
                ", groupNumber= " + groupNumber +
                ", grade= " + grade +
                ", schoolName= " + schoolName +
                ", programmingLanguage= " + programmingLanguage +
                '}';
    }
}

/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

 */