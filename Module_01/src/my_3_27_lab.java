import java.util.Scanner;

public class my_3_27_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String firstName;
        String secondName;
        String thirdName;
        char thirdNameChk;
        boolean thirdNameExists;
        //int nameCount;

        System.out.println("names"); //Just for testing

		userInput = scnr.nextLine();       //take first name,middle name and last name separated by a space as input from the user
		firstName = userInput;
        secondName = scnr.nextLine();

        thirdName = scnr.nextLine();
        thirdNameChk = thirdName.charAt(0);
        thirdNameExists =  Character.isWhitespace(thirdNameChk);

        System.out.println("userInput " + userInput);
        System.out.println("firstName " + firstName);
        System.out.println("secondName " + secondName);
        System.out.println("thirdName " + thirdName);
        System.out.println("thirdNameChk " + thirdNameChk);
        System.out.println("thirdNameExists " + thirdNameExists);


        /*
        String splits[]=userInput.split(" ");       //split the user input by space and store it in a string array named splits
		
        if (splits.length==2){           //check if length of splits array is equal to 2 or not if true means user entered only first name and last name
		    System.out.println(splits[1]+", "+splits[0].charAt(0)+".");     //so print the value at index 1 of splits array which is last name and followed by a comma and then to print first character of the first name print the first character of the string at index 0 of splits array
		}
		
        else {       //if user entered all three names then
		    System.out.println(splits[2]+", "+splits[0].charAt(0)+"."+splits[1].charAt(0)+".");     //print last name which is at index 2,followed by a comma and first characters of the strings at index 0 and index 1 of splits array followed by a dot(.)
		}
        */
    }
}