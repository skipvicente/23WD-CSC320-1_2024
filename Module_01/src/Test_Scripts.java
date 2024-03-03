import java.util.Scanner;

public class Test_Scripts {
   public static void main(String[] args) {
      
      int ageYears;
      int weightPounds;
      int heartRatePerMin;
      int timeMinutes;
      double wCalories;
      double mCalories;
      
      Scanner scnr1 = new Scanner(System.in);
      System.out.println("Enter age in years");
      ageYears = scnr1.nextInt();
      //caffeineMg = scnr.nextDouble();
      
      Scanner scnr2 = new Scanner(System.in);
      System.out.println("Enter weight in pounds");
      weightPounds = scnr2.nextInt();
      
      Scanner scnr3 = new Scanner(System.in);
      System.out.println("Enter heart rate in beats per minute");
      heartRatePerMin = scnr3.nextInt();

      Scanner scnr4 = new Scanner(System.in);
      System.out.println("Enter time in minute");
      timeMinutes = scnr4.nextInt();
      
      System.out.println(ageYears);
      System.out.println(weightPounds);
      System.out.println(heartRatePerMin);
      System.out.println(timeMinutes);

      wCalories = ( (ageYears * 0.074) - (weightPounds * 0.05741) + (heartRatePerMin * 0.4472) - 20.4022 ) * timeMinutes / 4.184;

      mCalories = ( (ageYears * 0.2017) + (weightPounds * 0.09036) + (heartRatePerMin * 0.6309) - 55.0969 ) * timeMinutes / 4.184;
      
      
      System.out.printf("Women: %.2f calories \n", wCalories);
      System.out.printf("Men: %.2f calories", mCalories);

      scnr1.close();
      scnr2.close();
      scnr3.close();
      scnr4.close();

   }
} 

