/* Create a Java program that will print the following (use input as basis):

Full name(Last name, First name)
Age
Gender
Address
Civil Status
# of brothers/sisters */
package archiel.lab.act.pkg1.pkg1;

import java.util.Scanner;


public class ArchielLabAct11 {

    static Scanner strings = new Scanner(System.in);
    static Scanner integers = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input your Name: Last name, First name Middle Initial: ");
        String name = strings.nextLine();
        
        System.out.print("Input your age: ");
        int age = integers.nextInt();
        
        System.out.print("Input your Gender: ");
        String gender = strings.nextLine();
        
        System.out.print("Input your Address: ");
        String address = strings.nextLine();
      
        System.out.print("Input your Civil Status: ");
        String status = strings.nextLine();
        
        System.out.print("Input the number of brothers/sisters: ");
        int sibling = strings.nextInt();
        
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil Status: " + status);
        System.out.println("Number of brothers/sisters: " + sibling);
    }
    
}
