import java.util.Scanner;

public class my_4_23_1_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int firstInt = scnr.nextInt();
        int secondInt = scnr.nextInt();

        // Check if the second integer is less than the first
        if (secondInt < firstInt) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            // Print the first integer and increments of 10 until reaching the second integer
            int currentInt = firstInt;
            while (currentInt <= secondInt) {
                System.out.print(currentInt + " ");
                currentInt += 10;
            }
            System.out.println();
        }
        
        scnr.close();
    }
}
    

