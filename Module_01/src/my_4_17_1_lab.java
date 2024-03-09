import java.util.Scanner;

public class my_4_17_1_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        char firstCharacter;
        String arrString [];
        int count = 0;

        userInput = scnr.nextLine(); 
        
        // Get the first character
        firstCharacter = userInput.charAt(0);
        
        // Get the string
        userInput = userInput.substring(2);
     

        // Iterate through each character in the inputString to count occurrences
        for (int i = 0; i < userInput.length(); i++) 
        {
            // Check if the character matches the inputChar
            if (userInput.charAt(i) == firstCharacter) 
            { 
                 // Increment the count if there's a match
                count++;
            }
        }


        System.out.println(count);

        /*

        // Output the result with a note before the output
        if (count == 1) 
        {
            // Output for count = 1
            System.out.println(count + " " + firstCharacter);
            
        } 
        else 
        {
            // Output for count > 1
            System.out.println(count + " " + firstCharacter + "'s"); 
        }

        // Close the scanner to release system resources
        */
        scnr.close();


    }
}
