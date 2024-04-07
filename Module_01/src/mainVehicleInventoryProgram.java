import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;

public class mainVehicleInventoryProgram {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> carMake = new ArrayList<>();
        ArrayList<String> carModel = new ArrayList<>();
        ArrayList<String> carColor = new ArrayList<>();
        ArrayList<Integer> carYear = new ArrayList<>();
        ArrayList<Integer> carMileage = new ArrayList<>();

        List<String> menuOptions = List.of("Add", "Edit", "Delete", "View", "Export" );

        AutomobileInventory car = new AutomobileInventory();
        car.setMake("");
        String make = car.getMake();
        
        car.setModel("");
        String model = car.getModel();
        
        car.setColor("");
        String color = car.getColor();
        
        car.setYear(0);
        Integer year = car.getYear();
        
        car.setMileage(0);
        Integer mileage = car.getMileage();
        
        int removeCar;
        int updateCar;
        
        /* to be removed Scanner scnr = new Scanner(System.in);
         // This allows the users to enter data
        ArrayList<String> carMake = new ArrayList<>();
        ArrayList<String> carModel = new ArrayList<>();
        ArrayList<String> carColor = new ArrayList<>();
        ArrayList<Integer> carYear = new ArrayList<>();
        ArrayList<Integer> carMileage = new ArrayList<>(); */
        
        do { // this is here so my menu loops after the users performs an action
            try {
                // User Menu
                System.out.println("******* Vehicle Inventory Program *******" 
                    + ""
                    + "Please type your selection from the following Menu Options:"
                    + ""
                    + "Add - This will add new vehicle."
                    + "Edit - This will permit vehicle infomration update."
                    + "Delete - This will remove existing vehicle from inventory list!"
                    + "View - This will display all vehicles in inventory."
                    + "Export - This will export data from invenotry to a TEXT file format!" 
                    + "" );
                    System.out.println("************************");
        
            String menu = scnr.nextLine(); 
        

            while (!menuOptions.contains(menu)) {
                System.out.println("That's not a valid Menu Option. Please enter a valid option.");
                menu = scnr.nextLine();
                System.out.println("");
            }
            
            if (menu == "Add") {
                System.out.println("Type the Make of the car you wish to enter:");
                make = scnr.next();
                carMake.add(make);
            
                System.out.println("Type the Model of the car you wish to enter:");
                model = scnr.next();
                carModel.add(model);
                
                System.out.println("Type the Color of the car you wish to enter:");
                color = scnr.next();
                carColor.add(color);
                
                System.out.println("Type the Year of the car you wish to enter:");
                year = scnr.nextInt();
                carYear.add(year);
                
                System.out.println("Type the Mileage of the car you wish to enter:");
                mileage = scnr.nextInt();
                carMileage.add(mileage);
        
        } 
        else if (menu == "Delete") {
            System.out.println("What car do you want to remove? (Type the number... IE: 0)");
            
            // Give the user options
            for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
            System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
            
            // Remove the indexes for the car selected... It's important to remove them all because if you don't the remaining cars will be out of sync
            removeCar = scnr.nextInt();
            carMake.remove(removeCar);
            carModel.remove(removeCar);
            carColor.remove(removeCar);
            carYear.remove(removeCar);
            carMileage.remove(removeCar);
        
        } 
        
        else if (menu == "Edit") {
            System.out.println("What car do you want to update? (Type the number... IE: 0)");
            
            for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
            System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
            
            updateCar = scnr.nextInt();
            System.out.println("Set the new Car Make:");
            carMake.set(updateCar, scnr.next());
            System.out.println("Set the new Car Model:");
            carModel.set(updateCar, scnr.next());
            System.out.println("Set the new Car Color:");
            carColor.set(updateCar, scnr.next());
            System.out.println("Set the new Car Year:");
            carYear.set(updateCar, scnr.nextInt());
            System.out.println("Set the new Car Mileage:");
            carMileage.set(updateCar, scnr.nextInt());
        
        } 
        
        else if (menu == "View") {
            System.out.println("Here are all of the cars currently in the inventory:");
            for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
            System.out.println(carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
        
        } 
        
        else if (menu == "Export") {
            System.out.println("Printing all data...");
        
            PrintWriter writer = new PrintWriter("TravisWoodward_AutomobileProgram.txt", "UTF-8");
            for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
            writer.println(carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
            writer.close();
        
        } 
        
        else {
            System.out.println("You must select a number between 1-5 (IE: 2).");
        }
        }
        
        catch (Exception e) {
            scnr.next(); // dont let users type strings where ints go!
            System.out.println("You may not put letters in that field. Please try again.\n");
        }
        }
        
        while (true);
        
    }
    scnr.close();

}
