import java.util.Scanner; 

public class my_2_34_lab {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String firstName;
       String genericLocation;
       int wholeNumber;
       String pluralNoun;
    
/*
       System.out.println("Enter info ");
       String firstName = scnr.nextLine();
       String genericLocation = scnr.nextLine();
       System.out.println("the updated info \n" + firstName);
       System.out.println("genlocation \n" + genericLocation);
       */

       System.out.println("Enter info ");
       firstName = scnr.next();
       genericLocation = scnr.next();
       wholeNumber = scnr.nextInt();
       pluralNoun = scnr.next();
  

       //genericLocation = scnr.nextLine();
       //wholeNumber = scnr.nextLine();
      // pluralNoun = scnr.nextLine();
    
       System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
       scnr.close();
    }
 }
 