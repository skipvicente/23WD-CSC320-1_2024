package Chapter_09_and_10.src;

public class Discussion_01 {
}

//SuperClass
public class rootInfo {
    public void setName(String newName) {
       this.newName = newName;
    }
 

    public void printnewName() {
       System.out.println(newName);
    }
 
    protected String newName;

 }
 


// Subclass to inherit the SuperClass and extend this.
 public class subInfo extends rootInfo { // subInfo derived from rootInfo
    
    @Override 
    public void newAKA() {
        System.out.println("is Also Known As: ");
    }
}
 


public class Main {
    public static void main(String[] args) {
/* Instance of SubInformation */
SubInfo currentInfo = new subInfo();
        
currentInfo.newAKA();  
    }
}