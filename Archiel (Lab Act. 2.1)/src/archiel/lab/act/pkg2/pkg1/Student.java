
package archiel.lab.act.pkg2.pkg1;


public class Student {
    
    private String FirstName, LastName;
    private int Age;
    private Boolean isMinor;
    
    
    public Student(String FirstName, String LastName, int Age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        
        if (this.Age < 18){
            isMinor = true;
            increaseAge();
        } else{
            isMinor = false;
        }
    }
    
    public String getName(){
  
        return LastName + ", " + FirstName;
    }
    
   
    public void increaseAge(){
        
             Age++;
 
        if (Age >= 18){
            isMinor = false;
        }
    }
    
    
    
    public String toString(){
        String minORadu;
        if (isMinor == true){
            minORadu = "minor";
        } else{
            minORadu = "adult";
        }
        String result = getName() + " - " + Integer.toString(Age) + " - " + minORadu;
        return result;
    }
   
}
