import java.util.Scanner;

public class my_4_25_1_lab {                         
    public static void main (String [] args) { 
       Scanner scnr = new Scanner(System.in);
       String userInput;
       String reversedUserInput = "";
       String noSpaces = "";


       userInput = scnr.nextLine();
       noSpaces = userInput.replace(" ", "");

       for (int i = noSpaces.length() - 1; i >= 0; i--) /* Reversing the string from the user input */
        {
            reversedUserInput += noSpaces.charAt(i);
        }


        if (noSpaces.equals(reversedUserInput)) 
        {
            System.out.println(userInput + " is a palindrome");
        }
        // Display that it is not a palindrome.
        else 
        {
            System.out.println(userInput + " is not a palindrome");
        }
        scnr.close();

    }
}
