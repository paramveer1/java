package String;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

import java.util.LinkedHashSet;

public class Duplicates {
    public static void main(String[] args) {
        String strng = "paraveer singh rajawat";
        strng = strng.replaceAll(" " ,"");
        Set s = new LinkedHashSet<>();
        for(int i = 0;i<strng.length();i++){
            s.add(strng.charAt(i));

        }
        System.out.println(s);
        for( Object i: s){
            System.out.print(i);

        }
      

    }

   
    
    
}
