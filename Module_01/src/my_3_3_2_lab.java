import java.util.Scanner;

public class my_3_3_2_lab {
        public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int carYear;
  
        
        System.out.println("Enter car year");
        carYear = scnr.nextInt();
  
        if (carYear < 1968) {
            System.out.println("Probably has few safety features.");
        }

        if (carYear > 1970) {
            System.out.println("Probably has seat belts.");
        }

        if (carYear > 1991) {
            System.out.println("Probably has anti-lock brakes.");
        }

        if (carYear > 2001) {
            System.out.println("Probably has tire-pressure monitor.");
        }    
        scnr.close(); 
     }
  }