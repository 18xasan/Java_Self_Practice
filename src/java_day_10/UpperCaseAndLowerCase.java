package java_day_10;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        int numOfUpperCase = 0, numOfLowerCase = 0;

        for (char eachCh : str.toCharArray()) {

            if (Character.isUpperCase(eachCh))
                numOfUpperCase++;
            if (Character.isLowerCase(eachCh))
                numOfLowerCase++;
        }

        boolean upperCIsEqualLoverC = numOfUpperCase == numOfLowerCase;
        System.out.println(upperCIsEqualLoverC);

    }
}

/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */
