import java.util.Scanner;
public class PallindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
       
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev *10+rem;
            temp = temp/10;


        }
        if (rev==a){
            System.out.println(a + "  is Pallindrome");
        }
        else{
            System.out.println(a + " is not Pallindrome");
        }

    }
    
}
