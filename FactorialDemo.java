import java.util. Scanner;
public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int f = 1;
        for(   ;i>0;i-- ){
          f=  i*f;

        }
        System.out.println(f);
    }
    
}
