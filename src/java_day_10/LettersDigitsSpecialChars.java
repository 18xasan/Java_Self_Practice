package java_day_10;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "";
        int digits = 0;
        String specialChars = "";

        for (char eachCh : str.toCharArray()) {
            if (Character.isLetter(eachCh))
                letters += eachCh;
            if (Character.isDigit(eachCh))
                digits += eachCh;
            if (!(Character.isLetterOrDigit(eachCh)))
                specialChars += eachCh;
        }

        System.out.println("letters = \"" + letters + "\";");
        System.out.println("digits = \"" + digits + "\";");
        System.out.println("specialChars = \"" + specialChars + "\";");

    }
}

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */

