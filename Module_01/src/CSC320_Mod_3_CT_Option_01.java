import java.util.Scanner;

public class CSC320_Mod_3_CT_Option_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double  weeklyIncome;
        double taxRate = 0.0;
        double taxWithholdings;

        System.out.print("Enter customers weekly income, $ ");

        if (scnr.hasNextDouble()){
            weeklyIncome = scnr.nextDouble();

            if ( weeklyIncome <= 0) {
                System.out.println("Invalid value."); // A negative number or zero were entered by user
            }

            else {
                if (weeklyIncome < 500) {
                    taxRate = 0.10;
                } 
                
                else if (weeklyIncome < 1500) {
                    taxRate = 0.15;
                } 
                
                else if (weeklyIncome < 2500) {
                    taxRate = 0.20;
                } 
                
                else {
                    taxRate = 0.30;
                }
            
                taxWithholdings = weeklyIncome * taxRate; // This takes the weekly income and multiplies by proper tax rate
        
                System.out.printf("The customers Average tax withholdings is: $ %.2f", taxWithholdings);
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scnr.close();
    }
}