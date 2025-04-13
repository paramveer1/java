// import java.util.LinkedHashSet;

import java.util.LinkedHashSet;

public class DuplicateElementSkipString {
    public static void main(String[] args) {
        String s = "Paramveer singh rajawat";
        s.trim();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        LinkedHashSet lhs = new LinkedHashSet();
        for(int n = 0;n<s.length();n++){
           lhs.add(s.charAt(n));
        }
     for(Object n : lhs){
        sb.append(n);
        
     }
     

        for(Object n : lhs){
            System.out.print(n + " ");
        }
        // System.out.println(sb);
        
    }
    
}
