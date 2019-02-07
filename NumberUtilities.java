
import java.lang.*;


public class NumberUtilities {

    public static String getRange(int stop) {
        
        StringBuilder sp = new StringBuilder();
        
       for (int i=0 ;i<stop; i++){
           
            sp.append(i);
        }
        
        return sp.toString();
        
    }

    public static String getRange(int start, int stop) {
        
        
        StringBuilder sp = new StringBuilder();
        
       for (int i=start ;i<stop; i++){
           
            sp.append(i);
        }
        
        return sp.toString();
        
    }


    public static String getRange(int start, int stop, int step) {
        
        StringBuilder sp = new StringBuilder();
        
       for (int i=start ;i<stop; i+=step){
           
            sp.append(i);
        }
        
        return sp.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        
        StringBuilder sp = new StringBuilder();
        
       for (int i=start ;i<stop; i++){
           
           if(i%2==0){
            sp.append(i);
        }
        }
        
        return sp.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sp = new StringBuilder();
        
       for (int i=start ;i<stop; i++){
           
           if(i%2!=0){
            sp.append(i);
        }
        }
        
        return sp.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
      StringBuilder sp = new StringBuilder();
        
       for (int i=start ;i<=stop; i++){
           
           
           int result = (int) Math.pow(i, exponent);
        
        
    
      sp.append(result);
        
    } 
     return sp.toString();
    }
}
    
       
    
        
        
        
    
    
    

