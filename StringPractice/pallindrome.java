package StringPractice;
import java.util.Scanner;


public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s= s.toLowerCase();
        String rev = "";
        for(int i = s.length()-1;i>= 0;i--)
        {
           rev =  rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("pallindrome");
        }
        else{
            System.out.println(
                "not pallindrome"
            );
        }
        
    }
    
}
