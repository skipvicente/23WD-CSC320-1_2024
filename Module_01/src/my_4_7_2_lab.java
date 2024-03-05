import java.util.Scanner;

public class my_4_7_2_lab {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;
      //int i;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      numRows = 2;
      numColumns = 3;

      System.out.println("");

        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                currentColumnLetter = (char) ('A' + currentColumn - 1);
                System.out.print(currentRow + "" + currentColumnLetter + " ");
                }
            }

        System.out.println(); 

        scnr.close();
        }
    }
