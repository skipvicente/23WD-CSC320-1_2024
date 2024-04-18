import java.util.Scanner;

public class my_4_7_1_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      //System.out.print("Enter user num ");
      userNum = scnr.nextInt();

      userNum = 3; //for testing

      for (i = 0; i <= userNum; i++) {
        for (j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(i);
      }


      scnr.close();

    }
}
