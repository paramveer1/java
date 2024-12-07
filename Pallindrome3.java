import java .util.Scanner;
public class Pallindrome3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Word to Reverse");
        String s = sc.nextLine();
    //    String [] st =  s.split(" ");
       String rev = "";
        for(int i = s.length()-1; i>=0;i--){
        rev = rev+s.charAt(i);
        }
       System.out.println(rev);
    //    System.out.println(rev.length());
    //    System.out.println(s.length());
        if(rev.equals(s)){
            System.out.println(s + " is Pallindrome");
        }
        else {
            System.out.println(s + " is not Pallindrome");
        }
    }
    
}
 