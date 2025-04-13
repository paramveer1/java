import java. util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 8;int b=2;
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch(c){
            case '+': System.out.println(a+b); 
            break;
            case '-': System.out.println(a-b);
            break;
            case'*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default: System.out.println("Invalid Input");

        }

        
    }
    
}
