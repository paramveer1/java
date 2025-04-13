import java.util.Scanner;
public class StringPallindrome11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);


        }
        if(s.equals(rev)){
            System.out.println(" Given String is Pallindrome");
        }
        else{
            System.out.println("Given String is not Pallindrome");
        }

    }

    
}
