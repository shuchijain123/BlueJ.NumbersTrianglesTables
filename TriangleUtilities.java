 import java.lang.*;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
         //StringBuilder sp = new StringBuilder();
         String astrick = "";
        for (int i=0;i<numberOfStars;i++){
            
            
            //sp.append(astrick);
            astrick = astrick+"*";
            
            
        }
        
        //return sp.toString();
        return astrick;
    }
    
    public static String getTriangle(int numberOfRows) {
        //StringBuilder sp = new StringBuilder();
        String triangle ="";
        
        for (int i=0;i<numberOfRows;i++){
            for (int j=0;j<=i;j++){
                
                triangle =  triangle+"*";
            }
            
            
            triangle = triangle+"\n";
          
            
        }
    return triangle;
          
    }


    public static String getSmallTriangle() {
        String triangle1="";
        TriangleUtilities st = new TriangleUtilities();
        
         triangle1 = st.getTriangle(4);
        
        
        return triangle1;
        
    }
          
            
            
            
           
        
       
    

    public static String getLargeTriangle() {
        String triangle1="";
        TriangleUtilities st = new TriangleUtilities();
        
         triangle1 = st.getTriangle(9);
        
        
        return triangle1;
        
    }
}
