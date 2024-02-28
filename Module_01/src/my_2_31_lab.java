import java.util.Scanner;

public class my_2_31_lab {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3 = 333;
      int num4 = 444;
      
      System.out.println("Enter 4 numbers");
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();

      double myNum = Math.multiplyFull(((num1 * num2) * num3), num4);
      double myNumAvg = (num1 + num2 + num3 + num4) / 4;

      //int myNum02 = myNum.intValue();
      //int myNumAvg02 = myNumAvg.intValue();
      int myNum02 = (int)Math.round(myNum);
      int myNumAvg02 = (int)Math.round(myNumAvg);

      //System.out.println(num1 + " * " + num2 + " * " + num3 + " * " + num4 + " = " + myNum);
      //System.out.println(" Avg num " + myNumAvg);

      System.out.print(myNum02 + " " + myNumAvg02 + "\n");
      System.out.printf("%.3f %.3f", myNum, myNumAvg);
      //System.out.printf("%.3f %.3f", myNum, myNumAvg);

      //System.out.printf(" MyNum %.3f", myNum);
      //System.out.printf("Avg %.3f" + myNumAvg);
   }
}
