package Chapter_09_and_10.src;

public class 10_1_2_practice {
    
}


// ===== Code from file PersonData.java =====
public class PersonData {
    private int ageYears;
    private String lastName;
 
    public void setName(String userName) {
       lastName  = userName;
    }
 
    public void setAge(int numYears) {
       ageYears = numYears;
    }
 
    // Other parts omitted
 
    public void printAll() {
       System.out.print("Name: " + lastName);
       System.out.print(", Age: "  + ageYears);
    }
 }
 // ===== end =====
 
 // ===== Code from file StudentData.java =====
 public class StudentData extends PersonData {
    private int idNum;
 
    public void setID(int studentId) {
       idNum = studentId;
    }
 
    public int getID() {
       return idNum;
    }
 }
 // ===== end =====
 
 // ===== Code from file StudentDerivationFromPerson.java =====
 public class StudentDerivationFromPerson {
    public static void main (String [] args) {
       StudentData courseStudent = new StudentData();
 
       courseStudent.printlastName("Name: " );
 
    }
 }
 // ===== end =====

 /************* Instructions 
  * Assign courseStudent's name with Smith, age with 20, and ID with 9999. Use the print member method and a separate println statement to output courseStudents's data. Sample output from the given program:
IE ==> Name: Smith, Age: 20, ID: 9999

  */