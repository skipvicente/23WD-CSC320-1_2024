import java.util.Scanner;

public class CSC320_Mod_4_CT_Option_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double total = 0.0;
        double average;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double interest;
        double inputValue;
        int count = 0;

        
        while (count < 5) {
            System.out.print("Enter floating point No. " + (count + 1) + ": ");
            if (scnr.hasNextDouble()) {
                inputValue = scnr.nextDouble();
                total += inputValue;

                // Update min and max
                min = Math.min(min, inputValue);
                max = Math.max(max, inputValue);

                count++; // Increment count after a valid input
            } else {
                //Error message is user enter letters or alpha numeric values
                System.out.println("Wrong value entered, Please enter again: ");
                scnr.next(); 
            }
        }

        average = total / 5;
        interest = total * 0.2;

        // Need to print TOTAL, AVERAGE, MAXIMUM, MINIMUM, INTEREST on TOTAL at 20%
        System.out.println(" ");
        System.out.printf("The Total is: %.2f \n", total);
        System.out.printf("The Average is: %.2f \n", average);
        System.out.println("The Max is: " + max);
        System.out.println("The Min is: " + min);
        System.out.printf("The Interest is: %.2f \n", interest);

        scnr.close();

    }
}