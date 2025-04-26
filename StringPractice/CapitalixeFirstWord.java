package StringPractice;
import java.util.Scanner;

public class CapitalixeFirstWord
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
       
        
        String first = s.substring(00, 1).toUpperCase();
        String last = s.substring(1);
        String full = first + last;
                System.out.println(full);

      
    }
    
}
