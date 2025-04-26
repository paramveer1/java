package StringPractice;

import java.util.HashSet;

public class CommonCharTwoString {
    public static void main(String[] args) {
        String s = "paraamveer";
        String s2 = "kjreugthhtbfeiojiowefngweuwge";

        char[] c = s.toCharArray();
        char [] c2 = s2.toCharArray();
        HashSet hs = new HashSet<>();
        HashSet hs2 = new HashSet<>();

        for(char i : c)
        {
            hs.add(i);


        }
        for(char i : c2){
            if(hs.contains(i))
            {
                hs2.add(i);
            }

        }
        System.out.println(hs2);

    }
    
}
