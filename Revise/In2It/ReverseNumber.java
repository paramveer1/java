package Revise.In2It;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 123456;
        int rev = 0;
        while(a>0)
        {
            int rem = a%10;
            rev = rev*10+rem;
            a = a/10;

        }
        System.out.print(rev);
    }
    
}
