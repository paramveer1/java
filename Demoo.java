import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demoo {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("d:/abcd.txt");

        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
}

