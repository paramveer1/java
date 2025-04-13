import java.util.Scanner;
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 no");
        int a = sc.nextInt();
        
        System.out.println("enter 2 no");
        int b = sc.nextInt();
        System.out.println("Enter Operation");
        int c = sc.nextInt();
        switch( c ){
            case 9: System.out.println("jhdclihsclids");
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default: System.out.println("provide valid operator only");
        }
    }
    
}
