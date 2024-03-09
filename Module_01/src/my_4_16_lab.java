import java.util.Scanner;

public class my_4_16_lab {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int largest = 0;
        int number = 0;
        int count = 0;
        int newAvg = 0;
        double avg = 0;

        while (true) {
            number = scnr.nextInt();
            if (number < 0) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            avg += number;
            count++;
        }

        if (count > 0) {
            avg /= count;
            newAvg = (int) avg;
        }

       
        //System.out.printf("%.0f \n", avg);
        System.out.println(newAvg + " " + largest);
    }
}