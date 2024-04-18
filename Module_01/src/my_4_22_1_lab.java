import java.util.Scanner;

public class my_4_22_1_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       

        int num = scnr.nextInt();

        // Check if number is valid or not
        if (num >= 11 && num <= 100) {
            // Print until %11 != 0
            while (num % 11 != 0) {
                // Print number
                System.out.print(num + " ");
                num -= 1;
            }
            // Print number
            System.out.println(num + " ");
        } else {
            // Print if number not valid
            System.out.println("Input must be 11-100");
        }
    }
}

