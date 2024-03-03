import java.util.Scanner;

public class CSC320_Mod_3_CT_Option_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        double wklyIncome;
        double taxRate;
        double taxWithholdings;
        double avgTaxW_holdings;

        System.out.println("Enter customers weekly income, $ ");

        userInput = scnr.nextDouble();
        wklyIncome = userInput;

        if (wklyIncome < 500) {
            taxRate = wklyIncome * 0.10;
            }
        
        else if ((wklyIncome >= 500) || (wklyIncome < 1500)) { 
            taxRate = wklyIncome * 0.15;
            }

        else if ((wklyIncome >= 1500) || (wklyIncome < 2500)) {
            taxRate = wklyIncome * 0.20;
            }

        else if (wklyIncome >= 2500) {
            taxRate = wklyIncome * 0.30;
            }
            
        taxWithholdings = wklyIncome * taxRate;
        avgTaxW_holdings = taxWithholdings / wklyIncome;
        
        System.out.println("The customers Average tax withholdings is: " + avgTaxW_holdings);
        
        scanner.close();    
    }
}
