import java.util.Scanner;

public class CSC320_Mod_4_CT_Option_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //double userInput;
        double total = 0.0;
        int count = 0;
        double average;
        double max = 0.0;
        double min;
        double interest;
        double inVal;

        max = Double.MIN_VALUE;
        min = Double.MAX_VALUE;
        
        while (count < 5 ) {
            System.out.print("Enter floating point No. " + (count + 1) + ": ");
            inVal = scnr.nextDouble();
            total += inVal;

            /* inVal_1 = scnr.nextDouble();
            inVal_2 = scnr.nextDouble();
            inVal_3 = scnr.nextDouble();
            inVal_4 = scnr.nextDouble();
            inVal_5 = scnr.nextDouble();
            min = Math.min(inVal_1, Math.min(inVal_2, Math.min(inVal_3, Math.min(inVal_4, inVal_5))));
            max = Math.max(inVal_1, Math.max(inVal_2, Math.max(inVal_3, Math.max(inVal_4, inVal_5))));
            
            //total = inVal_1 + inVal_2 + inVal_3 + inVal_4 + inVal_5; */
            
            if (inVal > max) {
                max = inVal;
            }

            else if (inVal < min)  {
                min = inVal;
            } 

            count = count + 1;
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