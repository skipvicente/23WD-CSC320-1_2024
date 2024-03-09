import java.util.Scanner;

public class my_4_14_lab {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scnr = new Scanner(System.in);

        // Read the user's input and store it in the 'num' variable
        int num = scnr.nextInt();

        // Call the 'convertToReverseBinary' function to get the reverse binary
        // representation
        String reverseBinary = convertToReverseBinary(num);

        // Display the reverse binary representation to the user
        System.out.println(reverseBinary);

        scnr.close();
    }

    // Function to convert a positive integer to its reverse binary representation
    public static String convertToReverseBinary(int num) {
        // Handle the special case when the number is 0
        if (num == 0) {
            return "0";
        }

        // Create a StringBuilder to build the binary representation
        StringBuilder binary = new StringBuilder();

        // Convert the number to reverse binary representation
        while (num > 0) {
            int bit = num % 2; // Get the remainder (0 or 1)
            binary.append(bit); // Append the bit to the binary representation
            num /= 2; // Divide the number by 2 to continue the process
        }

        // Reverse the binary representation and return it as a string
        return binary.toString();
    }
}