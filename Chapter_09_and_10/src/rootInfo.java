package Chapter_09_and_10.src;

public class Discussion_01 {
}

//SuperClass
public class rootInfo {
    protected String individualsName;
    protected String aliasName;

    public void setName(String individualsName, String aliaName) {
       this.individualsName = individualsName;
       this.aliasName = aliasName;
    }
 
    public void printInfo() {
       System.out.println("Individuals name is: \n");
       System.out.println(individualsName + "\n");
       System.out.println("Individuals also know as AKA: \n");
       System.out.println(aliasName + "\n");

    }
}
    

// Subclass to inherit the SuperClass and extend this.
 public class subInfo extends rootInfo { // subInfo derived from rootInfo
    protected String ethnicity;
    protected Integer individualsAge;

    public subInfo(String individualsName, String aliasName, String ethnicity, int individualsAge);
        super(individualsName, aliaName);
        this.ethnicity = ethnicity;
        this.individualsAge = individualsAge;
    
    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("Ethnicity is:  " + ethnicity);
        System.out.println("\n");
        System.out.println("Their age is:  " + individualsAge)

    }
}
 


public class Main {
    public static void main(String[] args) {
/* Instance of SubInformation */
CurrentInformation theirCurrentInfo = new subInfo("Samantha", "Sam", "Asian", 21);
theirCurrentInfo.printInfo();
        
    }
}