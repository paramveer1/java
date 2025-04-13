import java.util.Scanner;
public class PallindromeSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);

        }
        System.out.println("Reverse of word is " + rev);
        if(rev.equals(s)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }



        
    }

    
}
