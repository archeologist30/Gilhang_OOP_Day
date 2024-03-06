
/* Make a program where you define a sentence/message if its using capital
letter after the first letter of the word.

note: every word in the sentence/message ignores the first letter
*/


package archiel.lab.act.pkg1.pkg2.v2.pkg02.pkg14.pkg2024;

import java.util.Scanner;

public class ArchielLabAct12V202142024 {

    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
       
        System.out.print("Enter the message: ");
        String msg = input.nextLine();
        String[] words = msg.split("\\s+");
        int detect = 0;
        
  
        for (String word : words){
            if (!word.isEmpty()){
                
                word = word.substring(1);
                
                
                for (char a : word.toCharArray()){
                if ( a >= 'A' && a <= 'Z'){
                detect++;
                break;
                
            } 
            }
            }
        }
        
        if ( detect > 0 ){
                System.out.println("JEJE!");
                
                
            } 
        else {
            System.out.println("uWu!");
        }
            
         
        
        
    }
    
}



    
    

