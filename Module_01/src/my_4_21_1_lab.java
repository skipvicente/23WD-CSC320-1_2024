import java.util.Scanner;

public class my_4_21_1_lab {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String userText;
       // Add more variables as needed
       int count = 0;
       char ch;
    
       userText = scnr.nextLine();  // Gets entire line, including spaces. 
 
       for(int i=0;i<userText.length();i++){       //iterate i value from 0 to length of userText
        ch=userText.charAt(i);          //store character at index i in userText string in ch variable
        if(ch!=' '&& ch!='.'&& ch!='!'&& ch!=','){      //check if ch is not equal to space,period,exclamation point and comma
            count++;
        }
    }
    System.out.println(count);          //print count value after loop ends
    }
 }
 