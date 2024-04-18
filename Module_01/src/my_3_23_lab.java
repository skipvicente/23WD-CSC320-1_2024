import java.util.Scanner; 

public class my_3_23_lab {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String userInput; 
        int highwayNum;
        //int primaryNum;
        String nS = " going north/south.";
        String eW = " going east/west.";
        //String aux = " is auxiliary,";
        //String notValid = " is not a valid interstate highway number.";

        
    // for testing only
        System.out.println("Enter number");

        userInput = scnr.next();
        highwayNum = Integer.parseInt(userInput);
        
        if ((highwayNum >= 1) && (highwayNum <= 999)) {
            // Determine if it is a primary or auxiliary highway
            if (highwayNum >= 1 && highwayNum <= 99) {
                //System.out.println("print so far number is between 1-99 " + userInput + " highway num: " + highwayNum);
                //System.out.println("I-" + highwayNum + " is primary, going " /*+ getDirection(highwayNum)*/);
                
                if (highwayNum % 2 == 0){
                    //System.out.println("number was between 1-999 and re filtered through 1 - 99 and div by % 2");
                    System.out.println("I-" + highwayNum + " is primary," + eW);
                }
                
                else {
                    System.out.println("I-" + highwayNum + " is primary," + nS);
                }
            }

        else if (highwayNum >= 100 && highwayNum <= 999) {
                if (highwayNum % 2 == 0){
                    int tempPrimaryHighway = highwayNum %100;
                    //System.out.println("number was between 1-999 and re filtered through 1 - 99 and div by % 2");
                    System.out.println("I-" + highwayNum + " is auxiliary, serving I-"+ tempPrimaryHighway + "," + nS);
                }
            
                else {
                    int tempPrimaryHighway = highwayNum %100;
                    System.out.println("I-" + highwayNum + " is auxiliary, serving I-" + tempPrimaryHighway + "," + nS);
                }

            }


        } 
            
        else {
                System.out.println(highwayNum + " is not a valid interstate highway number.");
            }

        scnr.close();
        }
        
    }