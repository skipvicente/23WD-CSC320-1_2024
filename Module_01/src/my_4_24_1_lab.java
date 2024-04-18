import java.util.Scanner;

public class my_4_24_1_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String newWords = "";
        
        //System.out.println("Enter a line of text (or 'Quit', 'quit', or 'q' to exit): ");
        userInput = scnr.nextLine();

        while (!userInput.equalsIgnoreCase("quit") && !userInput.equalsIgnoreCase("q")) {
            for (int i = userInput.length() - 1; i >= 0; i--) {
                newWords += userInput.charAt(i);
            }
            System.out.println(newWords);
            newWords = ""; // Reset newWords for the next iteration
            userInput = scnr.nextLine();
        }

        scnr.close();
    }
}