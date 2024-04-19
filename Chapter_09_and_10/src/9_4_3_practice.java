import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class 9_4_3_practice {
    public static void main (String [] args) {
       Scanner scnr = new Scanner(System.in);
       String userItem;
 
       StringWriter itemCharStream = new StringWriter();
       PrintWriter itemsOSS = new PrintWriter(itemCharStream);
 
       System.out.println("Enter items (type Exit to quit):");
       userItem = scnr.next();
 
       while (!userItem.equals("Exit")) {

        itemsOSS.print(userItem + " ");
        userItem = itemCharStream.toString();
 
          userItem = scnr.next();
       }
 
       userItem = itemCharStream.toString();
       System.out.println(userItem);
    }
 }

 /* WORKING PASSED 4-17-2024 */






/* Instructions:
 * 
Write code that inserts userItems into the output string stream itemsOSS until the user enters "Exit". Each item should be followed by a space. Sample output if user input is "red purple yellow Exit":
red purple yellow

 */