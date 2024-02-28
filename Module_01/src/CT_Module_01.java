import java.util.Scanner;

public class CT_Module_01 {

	public static void main(String[] args) {

		System.out.println("Please follow prompts to enter your name and address."); ///test 2-20-24 *********git
		
		//Default info to be replaced by user sample
		String fName = "z";
		String lName = "zz";
		
		int addressNum = 1234;
		String addressName = "Some Street";
		String aCity = "City";
		int zipCode = 77388;

		
		System.out.println("Please enter your first name");
		Scanner fNameTemp = new Scanner(System.in ); // Entering First name here
		fName= fNameTemp.nextLine(); //Updating User first name
		fNameTemp.close(); 
		
		System.out.println("Please enter your last name");			
		Scanner lNameTemp = new Scanner(System.in); // Entering Last name here
		lName= lNameTemp.nextLine(); //Updating User last name	
		lNameTemp.close();	
	
		
		System.out.println("Please enter your street NUMBER only");			
		Scanner addressNumTemp = new Scanner(System.in); // Entering street address number
		addressNum= addressNumTemp.nextInt(); //Updating User street number
		addressNumTemp.close();		
			

		System.out.println("Please enter your street NAME only");			
		Scanner addressNameTemp = new Scanner(System.in); // Entering street name
		addressName= addressNameTemp.nextLine(); //Updating User street name
		addressNameTemp.close();				
		

		System.out.println("Please enter your city");			
		Scanner aCityTemp = new Scanner(System.in); // Entering City
		aCity= aCityTemp.nextLine(); //Updating User city
		aCityTemp.close();	
		
		
		System.out.println("Please enter your street ZIP CODE");			
		Scanner zipCodeTemp = new Scanner(System.in); // Entering street zip code
		zipCode= zipCodeTemp.nextInt(); //Updating User zip code
		zipCodeTemp.close();		
		
		
		// System.out.println(fName + " " + lName + ": " + addressNum + " " + addressName + " " + zipCode); // Testing updated variable
		System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);		
		System.out.println("Address: " + addressNum + " " + addressName);	
		System.out.println("City: " + aCity);
		System.out.println("Zip Code: " + zipCode);
		
				

	}

}