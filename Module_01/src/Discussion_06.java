import java.util.Scanner;

public class ContractorDiscountQualify {

    static double discountValue (double salesAmount){

        //This will check if the sales is over $5000 the sales will qualify for a contractor dicount 
        if (salesAmount > 5000) {
            return 10.0;
        } else if (salesAmount > 2000) {
            return 5.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter sale amount ");
        double saleAmount = scnr.nextDouble();

        double percentDiscount = discountValue(salesAmount);
        System.out.println("This sale qualifies for " + percentDiscount + "% Discount");
    }
}