import java.io.FileInputStream;
public class exc{
    public static void main(String[] args) {
        try{
        FileInputStream fis =  new FileInputStream("d:/abcd.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
