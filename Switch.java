import java. util. Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch(c){
            case 9: System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case'*': System.out.println(a*b);
            break;
            case'/': System.out.println(a/b);
            break;
            default: System.out.println("Input valid Operation");
        }
    }

    
}
