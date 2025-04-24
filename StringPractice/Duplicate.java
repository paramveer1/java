package StringPractice;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        String s = "aaaaaaaabbbbbbbbbbbbbbbbbbbcccccccccccccccccdddddddddddddd dfds";
        HashSet hm = new HashSet();
        char []c = s.toCharArray();
        for(char a : c)
        {
          if(!hm.add(a)) 
          {
            System.out.print(a);
          } 
        }
        System.out.print(hm);

    }
    
}
