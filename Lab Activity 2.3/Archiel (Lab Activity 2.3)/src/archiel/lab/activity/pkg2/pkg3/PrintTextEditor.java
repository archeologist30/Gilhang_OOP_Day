
package archiel.lab.activity.pkg2.pkg3;


public class PrintTextEditor extends TextEditor{

    public PrintTextEditor(String Text) {
        super(Text);
    }
    
    public void print(){
        System.out.println(getText());
    }
    
    
}
