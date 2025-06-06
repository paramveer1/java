package Practice;

public class PallindromeNo {
    public static void main(String[] args) {
        int b = 1234454321;
        int a = b;
        int rev = 0;

        while(a>0)
        {
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;

        }
        if(rev == b)
        {
            System.out.println("pallindrome no");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
    
}
