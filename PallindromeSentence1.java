import java .util . Scanner;
public class PallindromeSentence1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
             rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Pallindrome");
        }
        else
        System.out.println("not Pallind");
    }
    
}
