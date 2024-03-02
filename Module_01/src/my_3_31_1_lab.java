import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      int varRed;
      int varGreen;
      int varBlue;
      int varGray;
      
      //System.out.println("Enter RGB values ");
      userInput = scnr.next();
      varRed = Integer.parseInt(userInput);
      
      userInput = scnr.next();
      varGreen = Integer.parseInt(userInput);
      
      userInput = scnr.next();
      varBlue = Integer.parseInt(userInput);
      
     // varGreen = scnr.nextInt();
     // varBlue = scnr.nextInt();
      
      varGray = Math.min(varRed, Math.min(varGreen, varBlue));
      
      varRed -= varGray;
      varGreen -= varGray;
      varBlue -= varGray;
      
      System.out.println(varRed + " " + varGreen + " " + varBlue);
   }
}
