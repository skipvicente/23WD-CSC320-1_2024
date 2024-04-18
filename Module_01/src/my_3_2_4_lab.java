import java.util.Scanner;

public class my_3_2_4_lab {
        public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
  
        
        System.out.println("Enter number");
        userNum = scnr.nextInt();
  
        if (userNum > 0) {
            System.out.println("Positive.");
            }
        else {
            System.out.println("Non-positive, converting to 1.");
            userNum = 1;
            }

System.out.println("Final: " + userNum);
scnr.close(); 
     }
  }
