import java.util.Scanner;

public class my_4_19_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String word = scnr.next ();
        //Password of string type
        String password = "";
        //for-loop to iterate word length
        for (int i = 0; i < word.length (); i++)
          {
        //word of character type
        char c = word.charAt (i);
        if (c == 'i')
          {
            //Add 1 to password
            password = password + "!";
    
          }
        //if c==a
        else if (c == 'a')
          {
            //add @ to password
            password = password + "@";
    
          }
        //if c is equal to m
        else if (c == 'm')
          {
            //Add M to password
            password = password + "M";
    
          }
        //if c is equal to B
        else if (c == 'B')
          {
            //Add 8 to password
            password = password + "8";
    
          }
        else if (c == 's')
          {
            password = password + "s";
    
          }
          else if (c == 'o')
          {
            password = password + ".";
    
          }
        else
          {
            password = password + c;
    
          }
    
          }
          
        //Add ! to password
        password = password + "q*s";
        System.out.println (password);
    
      }
    
    }