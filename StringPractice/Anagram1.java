package StringPractice;
import java .util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        String s = "paramveer";
        String sr = "aarpmeerv ";
        char [] c = s.toCharArray();
        char [] c2 =  sr.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        System.out.println(c2);
        System.out.println(c);
       if(Arrays.equals(c2,c)       ) 
       {
        System.out.println("String Anagram");
       }
       else{
        System.out.println("notanahrma");
       }

    }
    
}
