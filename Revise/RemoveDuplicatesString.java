package Revise;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String swd = "";
        String s = "paramveer";
        char c [] = s.toCharArray();
        // List l = Arrays.asList(c);
        Set set = new HashSet();
        for(char i : c )
        {
            set.add(i);
        }
        
        // System.out.println(set);
        for(Object i :set)
        {
            swd = swd + i;
        }
        System.out.println(swd);

    }
    
}
