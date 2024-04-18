import java.util.Scanner;

public class my_3_28_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("Enter abbreviations");
        userInput = scnr.nextLine();

        switch(userInput) {
            case "LOL":
                    System.out.println("laughing out loud");
                    break;

            case "IDK":
                System.out.println("I don't know");
                break;
                
            case "BFF":
                System.out.println("best friends forever");
                break;

            case "IMHO":
                System.out.println("in my humble opinion");
                break;

            case "TMI":
                System.out.println("too much information");
                break;
            
            default:
                System.out.println("Unknown");
                break;
            
        }
        scnr.close();
    }
}   
