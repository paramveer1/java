import java.util.Scanner;
 public class pallindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp>0) {
            int r = temp%10;
            rev = rev*10+r;
            temp = temp/10;


            
        }
        if(rev==num){
            System.out.println("no is Pallindrome");

        }
        else{
            System.out.println(
            "not Pallindrome"
            );
        }
    }


    
}
