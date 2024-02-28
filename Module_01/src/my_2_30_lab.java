import java.util.Scanner;

public class my_2_30_lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      // Add more variables as needed
      //int areaCode;
      //int phonePrefix;
      //int phoneSuffix;
      int fullNum;

      
      
      /* Type your code here. */
      System.out.println("Enter phone number");

      phoneNumber = scnr.nextLong();
      long phoneSuffix = phoneNumber % 10000; // outputs the last 4 digits of phone
      long phonePrefix = (phoneNumber / 10000) % 1000;
      long areaCode = phoneNumber / 10000000; // the first 3 digits of phone

      System.out.println("area code num " + areaCode);
      System.out.println("Prefix num " + phonePrefix);
      System.out.println("suffix num " + phoneSuffix);

      System.out.println("(" + areaCode + ") " + phonePrefix + "-" + phoneSuffix);
   }
}