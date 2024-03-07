import java.util.Scanner;

public class my_4_11_1lab {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};
 
    public static void main (String [] args) {
       GroceryItem userItem;
 
       userItem = GroceryItem.GR_APPLES;
 
     if (userItem == GroceryItem.GR_APPLES) {
        System.out.println("Fruit");
        /*userCmd = scnr.next();
        if (userCmd.equals("n")) { // Next
           lightVal = LightState.YELLOW;
        }*/
     }
     else if (userItem == GroceryItem.GR_BANANAS) {
        System.out.println("Fruit");
        /*userCmd = scnr.next();
        if (userCmd.equals("n")) { // Next
           lightVal = LightState.RED;
        }*/
     }
     else if (userItem == GroceryItem.GR_JUICE) {
        System.out.println("Drink");
        /*userCmd = scnr.next();
        if (userCmd.equals("n")) { // Next
           lightVal = LightState.GREEN;
           }*/
        }
     else if (userItem == GroceryItem.GR_WATER) {
        System.out.println("Drink");
        /*userCmd = scnr.next();
        if (userCmd.equals("n")) { // Next
           lightVal = LightState.GREEN;
        }*/
 
    }
 }