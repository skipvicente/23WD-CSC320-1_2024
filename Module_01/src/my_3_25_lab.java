import java.util.Scanner;

public class my_3_25_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;

        //int myNewAmount;
        int myNewAmount01;
        int myNewAmount02;
        int myNewAmount03;
        //int myNewAmount04;

        //System.out.println("number"); //Just for testing
        userInput = scnr.nextInt();

        int count_dollars = ((userInput / 100) % 100);
        //System.out.println("count_dollars "+ count_dollars);
        int minus_count_dollars = count_dollars * 100;
        //System.out.println("minus_count_dollars "+ minus_count_dollars);
        myNewAmount01 = userInput - minus_count_dollars;
        //System.out.println("myNewAmount01 "+ myNewAmount01);

        int count_quarters = ((myNewAmount01 / 25) % 25);
        //System.out.println("count_quarters "+ count_quarters);
        int minus_count_quarters = count_quarters * 25;
        //System.out.println("minus_count_quarters "+ minus_count_quarters);
        myNewAmount02 = myNewAmount01 - minus_count_quarters;
        //System.out.println("myNewAmount02 "+ myNewAmount02);



        int count_dimes = ((myNewAmount02 / 10) % 10);
        //System.out.println("count_dimes "+ count_dimes);
        int minus_count_dimes = count_dimes * 10;
        //System.out.println("minus_count_dimes "+ minus_count_dimes);
        myNewAmount03 = myNewAmount02 - minus_count_dimes;
        //System.out.println("myNewAmount03 "+ myNewAmount03);


        int count_nickels = ((myNewAmount03 / 5) % 5);
        //System.out.println("count_nickels "+ count_nickels);
        int minus_count_nickels = count_nickels * 5;
        //System.out.println("minus_count_nickels "+ minus_count_nickels);
        //myNewAmount04 = myNewAmount03 - minus_count_nickels;
        //System.out.println("myNewAmount " + myNewAmount04);

        int count_pennies = ((((userInput - minus_count_dollars) - minus_count_quarters) - minus_count_dimes) - minus_count_nickels);
        //System.out.println("count_pennies " + count_pennies);

        scnr.close();

        if (userInput <= 0) {
            System.out.println("No change");
            return;
        }

        if (count_dollars >= 1) {
                System.out.println(count_dollars + " Dollars");
                }
        else if (count_dollars == 1) {
                System.out.println(count_dollars + " Dollar");
                }
        
        if (count_quarters > 1) {
                System.out.println(count_quarters + " Quarters");
                }
        else if (count_quarters == 1) {
                System.out.println(count_quarters + "Quarter");
                }
        
        if (count_dimes > 1) {
                System.out.println(count_dimes + " Dimes");
                }
        else if (count_dimes == 1) {
                System.out.println(count_dimes + "Dime");
                }

        if (count_nickels > 1) {
                System.out.println(count_nickels + " Nickels");
                }
        else if (count_nickels == 1) {
                System.out.println(count_nickels + " Nickel");
                }

        if (count_pennies > 1) {
                System.out.println(count_pennies + " Pennies");
                }
        else if (count_pennies == 1) {
                System.out.println(count_pennies + " Penny");
                }
            }
        }
