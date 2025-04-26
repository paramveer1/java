package StringPractice;

import java.util.LinkedHashMap;
import java.util.Map;


public class MaxOccurElement {
    public static void main(String[] args) {
        String s = "abbbbcccccddedddddd";
        
        char [] c = s.toCharArray();
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        for(char i : c)
        {
            if(lhm.containsKey(i))
            {
                lhm.put(i,lhm.get(i)+1);
            }
            else{
                lhm.put(i,1);
            }
        }
        int maxCount = 0;
        char maxChar= ' ';
               for(Map.Entry<Character,Integer> me: lhm.entrySet())
        {
            if(maxCount < me.getValue())
            {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }

        }
        System.out.println(maxChar);
        System.out.println(lhm);

        
    }
    
}
