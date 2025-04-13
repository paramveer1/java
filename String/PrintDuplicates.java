package String;
import java.util.LinkedHashSet;

public class PrintDuplicates {
    public static void main(String[] args) {
        String s = "paramsinghrajawat";
        LinkedHashSet lhs = new LinkedHashSet();
        for(int i = 0;i<s.length();i++){
          if(lhs.add(s.charAt(i))==false) {
            System.out.println(s.charAt(i));
          } 
        }

    }
    
}
