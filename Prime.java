import java.util.Scanner;
public class Prime
 {


    public static void main(String [] args)
    {
       
          
           int j = 0;
           for( j=1;j<101;j++)
        {
           int counter = 0;
           for(int i = 1;i<=j;i++)
           {
            
             if(j%i==0)
             {
                counter++;
             }
           }
         
         if(counter==2)
         {
             System.out.println(j);
          }
         

       
        }
          
   
    }
    
}
