// made in 03/15/24
package archiel.lab.activity.pkg2.pkg3;

import java.util.Scanner;

public class ArchielLabActivity23 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();
        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();
        TextEditor editor;

        if (editorType == 2) {
            editor = new AdvancedTextEditor(initialText);
        } else {
            editor = new PrintTextEditor(initialText);
        }

        Tester.test(editor);
        
        
    }
    
}
