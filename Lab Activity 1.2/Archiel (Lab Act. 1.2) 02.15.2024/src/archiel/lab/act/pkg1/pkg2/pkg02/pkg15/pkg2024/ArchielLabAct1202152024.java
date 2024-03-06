/* Make a program where you define a sentence/message if its using capital
letter after the first letter of the word.

note: every word in the sentence/message ignores the first letter
*/

package archiel.lab.act.pkg1.pkg2.pkg02.pkg15.pkg2024;

import java.util.Scanner;

public class ArchielLabAct1202152024 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the message: ");
        String msg = input.nextLine();
        int detect = 0;
        String[] words = msg.split("\\s+");
        
        
        
        StringBuilder msgresult = new StringBuilder();
        for (String word : words){
            if (!word.isEmpty()){
                msgresult.append(word.substring(1)).append(" ");
        }
        }
        String finalmsg = msgresult.toString().trim();
            
        for (char a : finalmsg.toCharArray()){
            if ( a >= 'A' && a <= 'Z')
            {
                System.out.println("JEJE!");
                detect++;
                break;
            } 
            
        } 
        if (detect == 0){
            System.out.println("uWu");
        }

        
        
    }
    
}
