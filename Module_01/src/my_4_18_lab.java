import java.util.Scanner;

public class my_4_18_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;

        // Prompt the user to enter a string representing an integer
        System.out.println("Enter a string representing an integer: ");
        userString = scnr.nextLine();

        // Initialize a boolean variable to keep track of whether the input string is an integer or not
        boolean isInt = true;

        // Use a for loop to iterate through each character in the input string
        for (int i = 0; i < userString.length(); i++) {
            // Use the Character.isDigit() method to check if the current character is a digit
            if (!Character.isDigit(userString.charAt(i))) {
                // If the current character is not a digit, set the isInt variable to false and break out of the loop
                isInt = false;
                break;
            }
        }

        // Use an if statement to check the value of the isInt variable
        if (isInt) {
            // If the isInt variable is true, print "Yes" to indicate that the input string is an integer
            System.out.println("Yes");
        } else {
            // If the isInt variable is false, print "No" to indicate that the input string is not an integer
            System.out.println("No");
        }
    }
}


    
    }
}
