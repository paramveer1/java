package Exception;
import java.util.Scanner;

public class CustomizedExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age ");
        int age = sc.nextInt();
        if(age < 18 ){
            throw new YoungerAgeException("");

        }
        else{
            System.out.println("u r eligible to vote");
        }
        System.out.println(" ohoooooo");
        
    }
    
}

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String s ){
        super(s);

    }
}
