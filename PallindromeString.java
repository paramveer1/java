import java . util. Scanner;
public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            // System.out.print(s.charAt(i));
            rev =rev+ s.charAt(i) ;
        }
        // System.out.println(rev);
       if(rev.equals(s)){
        System.out.println(s + " is Pallindrome");
       }
       else{
        System.out.println("Not Pallindrome");
    }
    }
    
}
