
package archiel.lab.activity.pkg3.pkg1;


public class Calculator {
    
    boolean hasOperator = false, trigPlus = false, trigDivide = false, trigMultiply = false, trigMinus = false;
    int input = 0, input2 = 0, result;
    float resultf;
    
    
    
    public void CalculatorOperation(){
        if (hasOperator == true){
          if (trigPlus == true){
              result = input + input2;
              
          }
          if (trigMinus == true){
              result = input2 - input;
          }
          if (trigMultiply == true){
              result = input * input2;
          }
          if (trigDivide == true){
              resultf = (float) input2 / (float) input;
              trigDivide = false;
          }
              
          }
        input = 0;
        input2 = 0;
        hasOperator = false;
        
    }
    
    
    
}
    
    
    

