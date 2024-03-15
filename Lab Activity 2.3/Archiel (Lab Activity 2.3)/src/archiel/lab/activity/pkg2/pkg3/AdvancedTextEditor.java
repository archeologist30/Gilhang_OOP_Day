
package archiel.lab.activity.pkg2.pkg3;


public class AdvancedTextEditor extends TextEditor{
    
    public AdvancedTextEditor (String text){
        super(text);  
    }
    
    public void undo(){
        index--;
            setText(history[index]);
        

        }
    public void print(){
        System.out.println(getText());
    }
}


