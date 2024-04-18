import java.util.Scanner;

public class my_3_22_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        int var01;
        int var02;
        int var03;
        int smallest;
        
        userInput = scnr.next();
        var01 = Integer.parseInt(userInput);
        
        userInput = scnr.next();
        var02 = Integer.parseInt(userInput);
        
        userInput = scnr.next();
        var03 = Integer.parseInt(userInput);
        
        smallest = Math.min(var01, Math.min(var02, var03));
        
        System.out.println(smallest);  
        
        scnr.close();
     }
  }
  