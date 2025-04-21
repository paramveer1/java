package String;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.next();
       
         int stringlen = s.length();
         System.out.println(stringlen);
         s = s.replaceAll(a,"");
        int stringlenupdated = s.length();
        int Occurence = stringlen-stringlenupdated;
        System.out.println(Occurence);
    }
    
}
