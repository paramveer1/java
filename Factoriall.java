import java.util.Scanner;
public class Factoriall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n;i>0;i--){
            fact = fact * i;

        }
        System.out.println(fact);
    }
    
}
