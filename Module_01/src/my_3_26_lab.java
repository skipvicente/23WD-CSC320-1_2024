import java.util.Scanner;

public class my_3_26_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;
        
        isLeapYear = false;

         System.out.println("Enter year"); //Just for testing
        inputYear = scnr.nextInt();
        
        if (inputYear % 4 == 0){
            if (inputYear % 100 == 0){
                if (inputYear % 400 == 0) {
                    isLeapYear = true;
                }

                else {
                    isLeapYear = false;
                }
            }

            else {
                isLeapYear = true;
            }
        }

        else {
            isLeapYear = false;
            }

        if (isLeapYear) {
            System.out.println(inputYear + " is a leap year.");
        }
        else {
            System.out.println(inputYear + " is not a leap year.");
        }

        scnr.close();
    }
 }
