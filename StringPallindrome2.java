import java.util.Scanner;
public class StringPallindrome2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
       String s=  sc.nextLine();
       String rev = "";
        for(int i = s.length()-1;i>=0;i--)
        {
           rev=  rev+s.charAt(i);
        }
        if(rev.equals(s))
        {
            System.out.println(s + " is Pallindrome");
        }
        else 
        System.out.println(s + " is not pallindrome");
        
    }
    
}
