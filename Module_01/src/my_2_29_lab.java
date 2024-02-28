import java.util.Scanner;

public class my_2_29_lab {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       double x;
       double y;
       double z;
       double result1;
       double result2;
       double result3;
       double result4;
       /* Type your code here. */

       System.out.println("Enter numbers");
       x = scnr.nextDouble();
       y = scnr.nextDouble();
       z = scnr.nextDouble();

       result1 = Math.pow(x,  z);
       result2 = Math.pow(x, (Math.pow(y, z)));
       result3 = Math.abs(y);
       result4 = Math.sqrt((Math.pow ((x * y) ,z)));

       System.out.printf("%.02f ", result1);
       System.out.print(result2 + " ");
       System.out.printf("%.01f ", result3);
       System.out.printf("%.01f ", result4);
       System.out.println(result4);

        /* The actual answers */
       System.out.print(result1 + " ");
       System.out.print(result2 + " ");
       System.out.printf("%.01f ", result3);
       System.out.println(result4);



    }
}
