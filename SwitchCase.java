import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    


    switch(a){
        case "on": System.out.println("One");
        break;
        case "tw" : System.out.println("Two");
        break;
        case "thre": System.out.println("Three");
        break;
        
        case "For": System.out.println("Four");
        break;
        default: System.out.println("Enter number 1 to 4 only");
    }
    }

    
}
