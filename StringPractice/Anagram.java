package StringPractice;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type String A");
        String a = sc.nextLine();
        a = a.toLowerCase();
        System.out.println("Type String B");

        String b = sc.nextLine();
        char [] ca = a.toCharArray();

        char [] cb = b.toCharArray();
        

        Arrays.sort(ca);
        Arrays.sort(cb);
        
      boolean result =  Arrays.equals(ca,cb);
      if(!result){
        System.out.println("Strings are not anagrams");
      }
      else
      {
        System.out.println("Strings are anagram");
      }






        
    }
    
}
