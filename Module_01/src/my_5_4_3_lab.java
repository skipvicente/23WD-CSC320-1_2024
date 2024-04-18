import java.util.Scanner;

public class my_5_4_3_lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner scnr2 = new Scanner(System.in);
      Scanner scnr3 = new Scanner(System.in);
      Scanner scnr4 = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      final int NUM_VALS = 4;
      int[] userVals = new int[NUM_ELEMENTS]; // Array of user numbers
      int[] testGrades = new int[NUM_VALS];   // Array of user grades
      int i;                                  // Loop index
      int maxVal;                             // Computed max
      int minVal;                             // Computed min
      int cntNeg;                             //Used as a counter
      int cntOdd;                             //Used as a counter
      int negVal;                             // Computed min
      int sumVal;
      int matchValue;
      int numMatches = -99;                   // Assign numMatches with 0 before your for loop
      int sumExtra;                           // Used to store extra credit INTEGER of amount over 100 in Grades
      boolean foundNumber;
      int userEnteredNum;


      /**** This is identify the maximum value in an array  *****/
      // Prompt user to populate array
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }

      // Determine largest (max) number
      maxVal = userVals[0];                   // Largest so far HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] > maxVal) {
            maxVal = userVals[i];
         }
      }

      minVal = userVals[0];                   // Smallest so far HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] < minVal) {
            minVal = userVals[i];
         }
      }

      cntNeg = 0;                           // Negative counter HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] < 0) {
           negVal = userVals[i];            // Saves the lowest neg value
           ++cntNeg;                        // adding to the NEG counter
         }
      }

      cntOdd = 0;                           // ODD counter HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         if ( (userVals[i] % 2) == 1) {
           ++cntOdd;                        // adding to the ODD counter
         }
      }

      sumVal = 0;                           // SUM HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         sumVal = sumVal + userVals[i];
      }

      for (i = userVals.length - 1; i >= 0; --i) { //Numbers print reversed
        System.out.println(userVals[i]);
     }

     maxVal = userVals[0];                      // Largest so far HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] >= maxVal) {
            maxVal = userVals[i];
            System.out.println(maxVal);        // Prints elemts up to the max value and superceded only by next HIGHEST number
         }
     }

     for (i = 0; i < userVals.length; ++i) {
        if (userVals[i] < 0) {
           System.out.println(userVals[i]);  // Prints elemets up to the LOWEST value and superceded only by next lowest number
        }
     }


     matchValue = scnr2.nextInt();          //Used a second instance of user input to ideniotfy what number is desired to find
     numMatches = 0;                        //Counter to store the number of located matches in the Array
      for (i = 0; i < userVals.length; ++i) {
        if (userVals[i] == matchValue) {
           ++numMatches;
        }
     }



     for (i = 0; i < testGrades.length; ++i) {
        testGrades[i] = scnr3.nextInt();
     }

     sumExtra = 0;                          // start storing extra credit points so far HOW to Initialize
      for (i = 0; i < userVals.length; ++i) {
            if(userVals[i] > 100){              //check if grade is GREATER then 100
                sumExtra += (userVals[i] - 100);   // User value of grade minus 100 and adding the remainder to extra credit
           }
     }


     for (i = 0; i < userVals.length; ++i) {          // This will print all the elements in the Array 
        System.out.print("Temp: ", userVals[i]);      // This will print Temp: ELEMENT in Array
        if(i < userVals.length - 1) {                 // This will check to see if it is NOT the last element and if TRUE then add ", SPACE"  
               System.out.print(", ");
        }
     }


     /***** SEARCH for Number in Array ******/

     // Nuumber in Array)
     int[] storedNums = {49, 70, 91, 112, 161, 182, 203,
        224, 245, 266, 287, 308, 329, 350};

     // Prompt user to enter letter weight
     System.out.print("Enter a number to search in Array: ");
     userEnteredNum = scnr4.nextInt();

     
     foundNumber = false;
     for (i = 0; (i < storedNums.length) && (!foundNumber); ++i) {
         if( userEnteredNum == storedNums[i] ) {
            foundNumber = true;
            System.out.print("Number was in existing in array ");
            System.out.print(storedNums[i]);
         }
      }
 
      if( !foundNumber ) {
         System.out.println("Your number " + userEnteredNum + " was not in array ");
      }
   }




      System.out.println("Max: " + maxVal);
      System.out.println("Min: " + minVal);
      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);

   }
}



 
