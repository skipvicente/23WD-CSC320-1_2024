import java.util.Scanner;

public class my_5_9_1_lab {
    public static void main (String [] args) {
       Scanner scnr = new Scanner(System.in);
       final int NUM_ROWS = 2;
       final int NUM_COLS = 2;
       int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
       int i;
       int j;
       int maxMiles; // Assign with first element in milesTracker before loop
       int minMiles; // Assign with first element in milesTracker before loop
 
       for (i = 0; i < milesTracker.length; i++){
          for (j = 0; j < milesTracker[i].length; j++){
             milesTracker[i][j] = scnr.nextInt();
          }
       }
 
       /* Your solution goes here  */
       // set maxMiles and minMiles to the first element in the array
       maxMiles = milesTracker[0][0];
       minMiles = milesTracker[0][0];
       // loop through each inner array
       for (i = 0; i < milesTracker.length; i++){
           // for each inner array loop through each element 
           for (j = 0; j < milesTracker[i].length; j++){
               // if the maxMiles is less than the current value, update the maxMiles
               if(maxMiles < milesTracker[i][j]) maxMiles = milesTracker[i][j];
               // if the minMiles is greater than the current value, update the minMiles
               if(minMiles > milesTracker[i][j]) minMiles = milesTracker[i][j];
           }
       }
 
       System.out.println("Min miles: " + minMiles);
       System.out.println("Max miles: " + maxMiles);
    }
 }