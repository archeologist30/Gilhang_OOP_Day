
package archiel.lab.act.pkg2.pkg1.ver.pkg2;

import java.util.Scanner;

public class ArchielLabAct21Ver2 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter test case number: ");
        int casenum = input.nextInt();
        
        if (casenum == 1){
            Student x = new Student("Jemar Jude", "Maranga", 16);
            System.out.println("Test Case 1: Student under 18");
            System.out.println(x.toString());
            
        } else if (casenum == 2){
            Student x = new Student("Jemar Jude", "Maranga", 18);
            System.out.println("Test Case 2: Increase age of student1");
            System.out.println(x.toString());
            
        } else if (casenum == 3){
            Student x = new Student("Jose", "Cruz", 19);
            System.out.println("Test Case 3: Student over 18");
            System.out.println(x.toString());
            
        } else{
            System.out.println("Invalid test case number");
            
        }
      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
