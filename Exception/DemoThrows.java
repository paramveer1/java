package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test {
     void readFile () throws FileNotFoundException 
     {
        FileInputStream fis = new FileInputStream("d:/abd.txt");
     }
}
public class DemoThrows {
    public static void main(String[] args) {
        Test t = new Test();
       try{ 
        t.readFile();
    }
       catch(FileNotFoundException e){
        System.out.println("exception handled successfully");

       }
       System.out.println(" code after try catch block");

        
        
    }
    
}
