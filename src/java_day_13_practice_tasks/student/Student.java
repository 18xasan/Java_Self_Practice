package java_day_13_practice_tasks.student;

class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("The age must be greater than zero.");
            System.exit(2);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isEmpty() || gender.isBlank()) {
            System.err.println("The gender must not be null, empty, or blank.");
            System.exit(3);
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Student1 extends Student {

    private String studentId, fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student1(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty() || studentId.isBlank()) {
            System.err.println("The student ID must not be null, empty, or blank.");
            System.exit(4);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("The field of study must not be null, empty, or blank.");
            System.exit(5);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!Character.isLetter(grade) || grade == '\u0000') {
            System.err.println("The grade must be a letter.");
            System.exit(6);
        }

        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()) {
            System.err.println("The school name must not be null, empty, or blank.");
            System.exit(7);
        }
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println("Student " + getName() + " is studying at " + schoolName + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}


class GraduateStudent extends Student1 {

    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);

    }

    @Override
    public void study() {
        System.out.println("Graduate student " + getName() + " is studying at " + getSchoolName() + ".");
    }
}

class UndergraduateStudent extends Student1 {

    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println("Undergraduate student " + getName() + " is studying at " + getSchoolName() + ".");
    }

}


class CydeoStudent extends Student1 {

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy,
                        char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber < 0) {
            System.err.println("The batch number must be greater than zero.");
            System.exit(8);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 0) {
            System.err.println("The group number must be greater than zero.");
            System.exit(9);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {

        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("The programming language must not be null, empty, or blank.");
            System.exit(10);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void study() {
        System.out.println("Cydeo student " + getName() + " is studying at " + getSchoolName() + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}

