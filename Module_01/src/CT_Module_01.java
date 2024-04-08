import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CT_Module_01 {

	public static void main(String[] args) {
		System.out.println("Please follow prompts to enter your name and address."); ///test 2-20-24 *********git
		
		String firstName;
		String lastName;
		//int addressNum;
		String streetName;
		String aCity;
		//int zipCode;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your first name");
		firstName = scnr.nextLine();
		System.out.println("");
		
		System.out.println("Please enter your last name");			
		lastName = scnr.nextLine();
		System.out.println("");
		
		System.out.println("Please enter your address NUMBER:");
        int addressNum = getIntInput(scnr);
		System.out.println("");

		Scanner scnr2 = new Scanner(System.in);
        System.out.println("Please enter your street NAME:");
        streetName = scnr2.nextLine();
		System.out.println("");

        System.out.println("Please enter your city:");
        aCity = scnr2.nextLine();
		System.out.println("");

        System.out.println("Please enter your street ZIP CODE:");
        int zipCode = getIntInput(scnr);
		System.out.println("");


        scnr.close();
		scnr2.close();		
		
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);		
		System.out.println("Address: " + addressNum + " " + streetName);	
		System.out.println("City: " + aCity);
		System.out.println("Zip Code: " + zipCode);
		
	}

    private static int getIntInput(Scanner scnr) {
        while (true) {
            try {
                return scnr.nextInt();
            } 
			
			catch (Exception e) {
                System.out.println("Invalid input enter a valid number");
                scnr.nextLine(); 
            }
        }
    }
}