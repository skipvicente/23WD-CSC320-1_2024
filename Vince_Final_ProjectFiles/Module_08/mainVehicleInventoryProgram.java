import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class mainVehicleInventoryProgram {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> carMake = new ArrayList<>();
        ArrayList<String> carModel = new ArrayList<>();
        ArrayList<String> carColor = new ArrayList<>();
        ArrayList<Integer> carYear = new ArrayList<>();
        ArrayList<Integer> carMileage = new ArrayList<>();

        List<String> menuOptions = List.of("add", "edit", "delete", "view", "export", "quit" );

        
        /* AutomobileInventory ourInventory  = new AutomobileInventory();
        ourInventory.setMake("");
        String vehicleMake = ourInventory.getMake();
        
        ourInventory.setModel("");
        String vehicleModel = ourInventory.getModel();
        
        ourInventory.setColor("");
        String vehicleColor = ourInventory.getColor();
        
        ourInventory.setYear(9999);
        Integer vehicleYear = ourInventory.getYear();
        
        ourInventory.setMileage(99999999);
        Integer vehicleMileage = ourInventory.getMileage(); */
        
        
        do { 
            try {
                
                System.out.println("******* Vehicle Inventory Program *******\n" 
                    + "\n"
                    + "Select from the following Menu Options:\n"
                    + "\n"
                    + "Add - This will add new vehicle.\n"
                    + "Edit - This will permit vehicle infomration update.\n"
                    + "Delete - This will remove existing vehicle from inventory list!\n"
                    + "View - This will display all vehicles in inventory.\n"
                    + "Export - This will export data from invenotry to a TEXT file format!\n"
                    + "Quit - This will exit the program." 
                    + "\n" 
                    + "****************************************\n"
                    + "\n" 
                    + "Please enter your option: ");
        
                String menu = scnr.nextLine().toLowerCase(); 
        

                if (!menuOptions.contains(menu)) {
                    System.out.println("That's not a valid Menu Option. Please enter a valid option.");
                    continue;
                }

                if (menu.equals("quit")) {
                    System.out.print("\n Exiting program - Good Bye. ");
                    break;
                }
                
                switch (menu) {
                    case "add":
                        addCar(scnr, carMake, carModel, carColor, carYear, carMileage);
                        break;
                    case "edit":
                        editCar(scnr, carMake, carModel, carColor, carYear, carMileage);
                        break;
                    case "delete":
                        deleteCar(scnr, carMake, carModel, carColor, carYear, carMileage);
                        break;
                    case "view":
                        viewInventory(carMake, carModel, carColor, carYear, carMileage);
                        break;
                    case "export":
                        System.out.print("\nDo you want to print the information to a file (Y or N) : ");
				
                        String userInput = scnr.nextLine().toLowerCase(); 
                        if (userInput.equals("y")) {

                            exportInventory(carMake, carModel, carColor, carYear, carMileage);
                            break;
                        }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.\n");
                scnr.nextLine(); 
            }
        } while (true);

        scnr.close();
    }

    private static void addCar(Scanner scnr, List<String> carMake, List<String> carModel, List<String> carColor,
                               List<Integer> carYear, List<Integer> carMileage) {
        System.out.println("Enter vehicle Make:");
        String temp_carMake = scnr.nextLine();
        carMake.add(temp_carMake);
        //carMake.add(scnr.nextLine());

        System.out.println("Enter vehicle Model:");
        String temp_carModel = scnr.nextLine();
        carModel.add(temp_carModel);
        //carModel.add(scnr.nextLine());

        System.out.println("Enter vehicle Color:");
        String temp_carColor = scnr.nextLine();
        carColor.add(temp_carColor);
        //carColor.add(scnr.nextLine());

        System.out.println("Enter vehicle Year:");
        int temp_carYear = scnr.nextInt();
        carYear.add(temp_carYear);
        //carYear.add(scnr.nextInt());

        System.out.println("Enter vehicle Mileage numbers only:");
        int temp_carMileage = scnr.nextInt();
        carMileage.add(temp_carMileage);
        //carMileage.add(scnr.nextInt());

        //String sYear = Integer.toString(temp_carYear);
        //String sMileage = Integer.toString(temp_carMileage);
        //System.out.println(temp_carMake, temp_carModel, temp_carColor, sYear, sMileage);
        System.out.println("");
        System.out.println("Vehicle:");
        System.out.println("      Make: " + temp_carMake);
        System.out.println("     Model: " + temp_carModel);
        System.out.println("     Color: " + temp_carColor);
        System.out.println("      Year: " + temp_carYear);
        System.out.println("   Mileage: " + temp_carMileage);
        System.out.println(". . . . . added successfully!\n");
        System.out.println("");

        scnr.nextLine(); 
    }

    private static void editCar(Scanner scnr, List<String> carMake, List<String> carModel, List<String> carColor,
                                List<Integer> carYear, List<Integer> carMileage) {
        System.out.println("Enter vehicle inventory 'index' you want to update:");
        int index = scnr.nextInt();
        index = index - 1;
        scnr.nextLine(); 

        if (index >= 0 && index < carMake.size()) {
            System.out.println("Enter update for vehicle Make:");
            carMake.set(index, scnr.nextLine());

            System.out.println("Enter update for vehicle Model:");
            carModel.set(index, scnr.nextLine());

            System.out.println("Enter update for vehicle Color:");
            carColor.set(index, scnr.nextLine());

            System.out.println("Enter update for Year of vehicle:");
            carYear.set(index, scnr.nextInt());

            System.out.println("Enter update for vehicle Mileage numbers only:");
            carMileage.set(index, scnr.nextInt());

            scnr.nextLine(); 
            System.out.println("Car updated successfully.\n"
            + "\n" );
        } else {
            System.out.println("Invalid index.\n");
        }
    }

    private static void deleteCar(Scanner scnr, List<String> carMake, List<String> carModel, List<String> carColor,
                                  List<Integer> carYear, List<Integer> carMileage) {
        System.out.println("Enter vehicle inventory 'index' you want to delete:");
        int index = scnr.nextInt();
        index = index - 1;
        scnr.nextLine(); 

        if (index >= 0 && index < carMake.size()) {
            carMake.remove(index);
            carModel.remove(index);
            carColor.remove(index);
            carYear.remove(index);
            carMileage.remove(index);
            System.out.println("Vehcile deleted successfully.\n");
        } else {
            System.out.println("Invalid index.\n");
        }
    }

    private static void viewInventory(List<String> carMake, List<String> carModel, List<String> carColor,
                                      List<Integer> carYear, List<Integer> carMileage) {
        if (carMake.isEmpty()) {
            System.out.println("Inventory is empty.\n");
        } else {
            System.out.println("Current Inventory:\n");
            for (int i = 0; i < carMake.size(); i++) {
                System.out.println((i + 1) + ". " + carMake.get(i) + ", " + carModel.get(i) + ", " +
                        carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i));
            }
            System.out.println();
        }
    }

    private static void exportInventory(List<String> carMake, List<String> carModel, List<String> carColor, List<Integer> carYear, List<Integer> carMileage) {
    try {
        File file = new File("C:/Temp/Autos.txt");
        FileWriter writer = new FileWriter(file);
        String[] infoArray = AutomobileInventory.ourInventory(carMake, carModel, carColor, carYear, carMileage);
        for (String info : infoArray) {
            writer.write(info + "\n");
        } 

        writer.close();
        System.out.println("Vehicle information printed to file."); 
    } 
    
    catch (IOException e) {
        System.out.println("Error: Unable to print vehicle information to file.");
    }
}

public class AutomobileInventory {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    
    public void setMake(String make) {
        this.make = make;
    }  
    public String getMake() {
        return make;
    } 

    public void setModel(String model) {
        this.model = model;
    }    
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    } 
    public String getColor() {
        return color;
    }
    
    public void setYear(int year) {
        this.year = year;
    }    
    public int getYear() {
        return year;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }    
    public int getMileage() {
        return mileage;
    }
     
    }
}


