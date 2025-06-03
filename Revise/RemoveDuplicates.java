package Revise;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        char c [] = s.toCharArray();
        HashSet hs = new HashSet<>();
        for(char i :  c)
        {
            hs.add(i);
        }


        String updated = "";
        for(Object o :hs)
        {
            updated = updated+o;
        }

        System.out.println(updated);

    }
    
}
