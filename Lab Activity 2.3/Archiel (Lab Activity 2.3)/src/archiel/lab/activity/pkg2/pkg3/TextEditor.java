
package archiel.lab.activity.pkg2.pkg3;

public class TextEditor {
    
    private String text;
    int index = 0;
    String[] history = new String[6];
    
    public TextEditor(String Text) {
        text = Text;
        
        history[index] = Text;        
        index++;
        
    }
    
    
  
    public String getText() {
        return text;
    }
            
   
    public void setText (String text){
        this.text = text;
    }   
    
    public void append(String newText) {
        
        history[index] = text;    
        index++;
        
        
           text += newText;
      
    }
    
    public void delete(int n){
       
        history[index] = text;    
        index++;
        
        int l = text.length();
        if ( n <= l){
 
             text = text.substring(0 ,l - n);

        }
    }
    
}
