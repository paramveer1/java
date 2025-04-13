import java.util.Scanner;
public class Pallindrome0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int rev = 0;
        while(temp>0){
            int r = temp%10;
            rev= rev*10+r;
            temp = temp/10;

        }
        if(rev==a){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }
    }
    
}
