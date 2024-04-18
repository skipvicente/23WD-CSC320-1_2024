import java.util.Scanner;

public class my_4_15_lab {
    public static void main(String[] args) {
        /* Scanner scnr = new Scanner(System.in);
        String userInput01;
        String userInput02;
        int userNum;
        
        String msg = "a day keeps you happy and healthy.";
        
        userInput01 = scnr.next();
        userInput02 = scnr.next();
        userNum = Integer.valueOf(userInput02);
      
          while (userInput01 != "quit") {
              System.out.println("Eating " + userNum + " " + msg);
              userInput01 = scnr.next();
              userInput02 = scnr.next();
              userNum = Integer.valueOf(userInput02);
              
           
          }
          */
/*
      Scanner scnr = new Scanner(System.in);
      String userInput01;
      String userInput02;
      int userNum;
      
      String msg = "a day keeps you happy and healthy.";
      
      userInput01 = scnr.next();
      userInput02 = scnr.next();
      userNum = Integer.valueOf(userInput02);
    
      while (!userInput01.equalsIgnoreCase("quit")) {
			// reading count
			userNum = scnr.nextInt();
			// displaying the message in proper format
			System.out.println("Eating " + userNum + " " + userInput01
					+ " a day keeps you happy and healthy.");
			// reading next word.
			userInput01 = scnr.next();
		}
     }
  }
  */
  
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String count;
        //int count01;

        userInput = scnr.nextLine();

        while (!userInput.equalsIgnoreCase("quit")) {
            count = scnr.next();
            //count01 = Integer.valueOf(count);

            System.out.println("Eating " + userInput + " " + count + " a day keeps you happy and healthy.");

            userInput = scnr.next(); 
        }

        scnr.close(); 
    }
}
