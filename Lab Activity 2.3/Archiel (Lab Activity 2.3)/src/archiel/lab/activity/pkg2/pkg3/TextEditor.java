
package archiel.lab.activity.pkg2.pkg3;

public class TextEditor {
    
    private StringBuilder text;
    int index = 0;
    String[] history = new String[6];
    
    public TextEditor(String Text) {
        this.text = new StringBuilder(Text);
        
        history[index] = Text;        
        index++;
        
    }
    
    
  
    public String getText() {
        return this.text.toString();
    }
            
   
    public void setText (String text){
        this.text = new StringBuilder(text);
    }   
    
    public void append(String newText) {
        
        history[index] = text.toString();    
        index++;
        
        text.toString();
        this.text.append(newText);
      
    }
    
    public void delete(int n){
       
        history[index] = text.toString();    
        index++;
        
        int l = text.length();
        if ( n <= l){
 
            text.substring(l - n, l);

        }
    }
    
}
