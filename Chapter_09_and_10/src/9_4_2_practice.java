import java.util.Scanner;

public class 9_4_2_practice {
   public static void main (String [] args) {
      Scanner inSS = null;
      String userInput = "Jan 12 1992";
      inSS = new Scanner(userInput);

      String userMonth;
      int userDate;
      int userYear;

      
      userMonth = inSS.next();
      userDate = inSS.nextInt();
      userYear = inSS.nextInt();

      System.out.println("Month: " + userMonth);
      System.out.println("Date: " + userDate);
      System.out.println("Year: " + userYear);
   }
}

 /*   SAMPLE
 import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // Input stream for standard input
      Scanner inSS = null;                   // Input string stream
      String lineString;                     // Holds line of text
      String firstName;                      // First name
      String lastName;                       // Last name
      int userAge;                           // Age
      boolean inputDone;                     // Flag to indicate next iteration

      inputDone = false;

      // Prompt user for input
      System.out.println("Enter \"firstname lastname age\" on each line");
      System.out.println("(\"Exit\" as firstname exits).\n");

      // Grab data as long as "Exit" is not entered
      while (!inputDone) {

         // Entire line into lineString
         lineString = scnr.nextLine();

         // Create new input string stream
         inSS = new Scanner(lineString);

         // Now process the line
         firstName = inSS.next();

         // Output parsed values
         if (firstName.equals("Exit")) {
            System.out.println("   Exiting.");

            inputDone = true;
         }
         else {
            lastName = inSS.next();
            userAge = inSS.nextInt();

            System.out.println("   First name: " + firstName);
            System.out.println("   Last name: " + lastName);
            System.out.println("   Age: " + userAge);
            System.out.println();
         }
      }
   }
}

 ***** or ***

 firstName = scnr.next();
      lastName = scnr.next();
      userAge = scnr.nextInt();


  */