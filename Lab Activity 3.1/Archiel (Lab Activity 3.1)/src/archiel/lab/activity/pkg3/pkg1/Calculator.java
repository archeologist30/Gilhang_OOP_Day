
package archiel.lab.activity.pkg3.pkg1;


public class Calculator {
    
    protected boolean hasOperator = false, trigPlus = false, trigEqual = false;
    protected int input = 0, input2 = 0, result;
    
    
    
    
    public void CalculatorOperation(){
        if (trigEqual == true){
          if (trigPlus == true){
              result = input + input2;
              
          }
        
       }
       
        input = 0;
        input2 = 0;
        hasOperator = false;
        trigEqual = false;
    }
    
    
    
}
    
    
    

