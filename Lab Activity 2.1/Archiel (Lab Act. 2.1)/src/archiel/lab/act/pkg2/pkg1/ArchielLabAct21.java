
package archiel.lab.act.pkg2.pkg1;

import java.util.Scanner;
public class ArchielLabAct21 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstname = input.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastname = input.nextLine();
        
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        
      Student x = new Student(firstname, lastname, age);
      
        int check = x.checking();
        
        System.out.println();
        
        if (check > 0){
            System.out.println("Age has been increased by one...");
        } else{
            System.out.println("Age doesn't need to be increased...");
        }
        System.out.println();
        System.out.println("--------Student Profile--------");
        System.out.println(x.toString());
        
    }
    
}
