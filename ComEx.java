import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ComEx {
   
    public static void main(String[] args) {
       
       try{
        FileInputStream fis = new FileInputStream("d:/abd.txt");
        System.out.println(" It will not be Printed");
       }
        
       catch(FileNotFoundException e){
        System.out.println(e);
       }
        
    }
 
}


