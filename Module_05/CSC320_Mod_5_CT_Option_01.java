import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/****** 5.9.1 has arrays that I can use to create two dimension array days f week and temp */
public class CSC320_Mod_5_CT_Option_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);

        ArrayList<String> daysInWeek = new ArrayList<>();
        ArrayList<Double> dailyTemp = new ArrayList<>();
        List<String> validWeekDays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" );

        //String dayofWeek; ** Moved to scnr input to check for valid data
        //Double temperature; ** Moved to scnr input to check for valid data
        
        
        for (int i=0; i<7; i++){

            System.out.print("Enter week day: (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): ");
            String dayOfWeek = scnr.nextLine();

            while (!validWeekDays.contains(dayOfWeek)) {
                System.out.println("That's not a valid weekday. Please enter a valid weekday.");
                dayOfWeek = scnr.nextLine();
                System.out.println("");
            }

            System.out.print("Please enter temperature for " + dayOfWeek + " in Fahrenheit: ");
            double temperature = scnr.nextDouble();
            scnr.nextLine(); 
            System.out.println("");

            daysInWeek.add(dayOfWeek);
            dailyTemp.add(temperature);
        }


        while (true){
            System.out.print("Enter weekday (Monday-Sunday) or enter 'week' for weekly average: ");
            String input = scnr.nextLine();
            
            if (input.equalsIgnoreCase("week")) {
               
                double weeklyAverage = calculateWeeklyAverage(dailyTemp);
                System.out.println("Weekly Average Temperature is: " + weeklyAverage);
                System.out.println("");
            } 
            
            else if (daysInWeek.contains(input)) {
                
                int index = daysInWeek.indexOf(input);
                double temperature  = dailyTemp.get(index);
                System.out.println("Temperature for " + input + ": " + temperature);
                System.out.println("");
            } 
            
            else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
                System.out.println("");
                
            }
            
            
            System.out.print("Do you want to check another day or 'week' (Yes / No)? ");
            String continueInput = scnr.nextLine().toLowerCase();
            System.out.println("");


            if (continueInput.equals("no")){
                break;
            }
        }


    scnr.close();
    scnr2.close();

    }

    //calculate weekly average temperature
    private static double calculateWeeklyAverage(ArrayList<Double> temperatures){
        double sum = 0;
        for (double temperature : temperatures){
            sum += temperature;
        }

        double averageTempForWeek = sum / temperatures.size();
        averageTempForWeek = Math.round(averageTempForWeek);
        return averageTempForWeek;
    }
}