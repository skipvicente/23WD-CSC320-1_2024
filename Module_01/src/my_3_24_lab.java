import java.util.Scanner;

public class my_3_24_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String inputMonth;
        int inputDay;

        System.out.println("Enter month and day "); //Just for testing
        userInput = scnr.next();
        inputMonth = userInput;

        userInput = scnr.next();
        inputDay = Integer.parseInt(userInput);

        switch(inputMonth) {
            case "January":
                if ((inputDay > 0) && (inputDay <= 31)) {
                    System.out.println("Winter");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "February":
                if ((inputDay > 0) && (inputDay <= 28)) {
                    System.out.println("Winter");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }
            
            case "March":
                if ((inputDay > 0) && (inputDay <= 19)) {
                    System.out.println("Winter");
                    break;
                }

                else if ((inputDay >= 20) && (inputDay <= 31)) {
                    System.out.println("Spring");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "April":
                if ((inputDay > 0) && (inputDay <= 30)) {
                    System.out.println("Spring");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }
                
            case "May":
                if ((inputDay > 0) && (inputDay <= 31)) {
                    System.out.println("Spring");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "June":
                if ((inputDay > 0) && (inputDay <= 19)) {
                    System.out.println("Spring");
                    break;
                }

                else if ((inputDay >= 20) && (inputDay <= 30)) {
                    System.out.println("Summer");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }
            
            case "July":
                if ((inputDay > 0) && (inputDay <= 31)) {
                    System.out.println("Summer");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "August":
                if ((inputDay > 0) && (inputDay <= 31)) {
                    System.out.println("Summer");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }
            
            case "September":
                if ((inputDay > 0) && (inputDay <= 21)) {
                    System.out.println("Summer");
                    break;
                }

                else if ((inputDay >= 22) && (inputDay <= 30)) {
                    System.out.println("Autumn");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "October":
                if ((inputDay > 0) && (inputDay <= 31)) {
                    System.out.println("Autumn");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }
            
            case "November":
                if ((inputDay > 0) && (inputDay <= 30)) {
                    System.out.println("Autumn");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            case "December":
                if ((inputDay > 0) && (inputDay <= 20)) {
                    System.out.println("Autumn");
                    break;
                }

                else if ((inputDay >= 21) && (inputDay <= 31)) {
                    System.out.println("Winter");
                    break;
                }
                else; {
                    System.out.println("Invalid");
                    break;
                }

            default:
                System.out.println("Invalid");
                break;

            
          }

 

    }
}
