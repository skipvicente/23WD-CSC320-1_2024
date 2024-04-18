package Vince_Final_ProjectFiles.Module_01_Updated;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CT_Module_01 {

	public static void main(String[] args) {

		System.out.println("Please follow prompts to enter your name and address."); ///test 2-20-24 *********git


		
		String firstName = "z";
		String lastName = "zz";
		int addressNum = 1234;
		String addressName = "Some Street";
		String aCity = "City";
		int zipCode = 77388;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your first name");
		firstName = scnr.nextLine();
		
		System.out.println("Please enter your last name");			
		lastName = scnr.nextLine();
	
		
		System.out.println("Please enter your street NUMBER only:");
        addressNum = scnr.nextInt();

        System.out.println("Please enter your street NAME only:");
        addressName = scnr.nextLine();

        System.out.println("Please enter your city:");
        aCity = scnr.nextLine();

        System.out.println("Please enter your street ZIP CODE:");
        zipCode = getIntInput(scnr);

        scnr.close();		
		
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);		
		System.out.println("Address: " + addressNum + " " + addressName);	
		System.out.println("City: " + aCity);
		System.out.println("Zip Code: " + zipCode);
		
	}

    private static int getIntInput(Scanner scnr) {
        while (true) {
            try {
                return scnr.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input enter a valid zip code");
                scnr.nextLine(); 
            }
        }
    }
}