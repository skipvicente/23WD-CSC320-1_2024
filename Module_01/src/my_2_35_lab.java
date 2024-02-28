import java.util.Scanner;

public class my_2_35_lab {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userInt;
    double userDouble;
    char userChar[];
    String userString;
    // FIXME Define char and string variables similarly
    
    System.out.println("Enter integer:");
    userInt = scnr.nextInt();
    
    System.out.println("Enter double:");
    userDouble = scnr.nextDouble();

    System.out.println("Enter character:");
    String str = scnr.next();
    userChar = str.toCharArray();
    String userCharPrt = String.valueOf(userChar); 

    System.out.println("Enter string:");
    userString = scnr.next();
    int newUserDouble = (int) userDouble;
    
    /* FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space */
    System.out.println(userInt + " " + userDouble + " " +  userCharPrt  + " " + userString);
 
    /*  FIXME (2): Output the four values in reverse */
    System.out.println(userString + " " + userCharPrt + " " +  userDouble  + " " + userInt);
    
    /* FIXME (3): Cast the double to an integer, and output that integer */
    System.out.println(userDouble + " cast to an integer is " + newUserDouble);

    scnr.close(); 
 }
}