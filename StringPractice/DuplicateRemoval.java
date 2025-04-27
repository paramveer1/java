package StringPractice;

import java.util.LinkedHashSet;

public class DuplicateRemoval {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        LinkedHashSet hs = new LinkedHashSet<>();
        char [] c = s.toCharArray();
        for(char i : c)
        {
            hs.add(i);
        }
        System.out.println(hs);
         String ss ="";
        for(Object i :  hs)
        {
            ss = ss+i;
        }
        System.out.println(ss);


    }
    
}
