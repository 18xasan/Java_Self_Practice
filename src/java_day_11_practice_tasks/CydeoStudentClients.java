package java_day_11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Alex", "B33", 27, 4568, 9, 'B');
        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgLanguage();
        System.out.println(cydeoStudent1);

        System.out.println();

        CydeoStudent cydeoStudent2 = new CydeoStudent("Brian", "B33", 37, 52568, 4, 'C');
        cydeoStudent2.study();
        cydeoStudent2.attendClass();
        cydeoStudent2.printSchoolName();
        cydeoStudent2.printProgLanguage();
        System.out.println(cydeoStudent2);

    }
}

