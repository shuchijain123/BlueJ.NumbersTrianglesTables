 import java.lang.*;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        
        String table1 ="";
      
        int dimension = 5;
        int number =0;
        
        for (int i=1;i<=dimension;i++){
            for (int j=1;j<=dimension;j++){
                
               number = i*j;
               
               
               table1= table1+String.format("%3d |" , number);
               
            }
            
            
            table1 = table1+"\n";
          
            
        }
    
    return table1.toString();
    }

    public static String getLargeMultiplicationTable() {
            String table1 ="";
      
        int dimension = 10;
        int number =0;
        
        for (int i=1;i<=dimension;i++){
            for (int j=1;j<=dimension;j++){
                
               number = i*j;
              
               table1= table1+String.format("%3d |" , number);
               
            }
            
            
            table1 = table1+"\n";
          
            
        }
    
    return table1.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        String table1 ="";
      
        
        int number =0;
        
        for (int i=1;i<=tableSize;i++){
            for (int j=1;j<=tableSize;j++){
                
               number = i*j;
              
               table1= table1+String.format("%3d |" , number);
               
            }
            
            
            table1 = table1+"\n";
          
            
        }
    
    return table1.toString();
    }
    }

