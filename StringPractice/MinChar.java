package StringPractice;

import java.util.LinkedHashMap;
import java.util.Map;


public class MinChar{
    public static void main(String[] args) {
        
        String s = "paramveer singh rajawat boss hai ";
        s = s.replaceAll(" ","");
        LinkedHashMap <Character,Integer> lhm = new LinkedHashMap<>();
        char [] c = s.toCharArray();
        for(char i : c )
        {
            if(lhm.containsKey(i))
            {
                lhm.put(i,lhm.get(i)+1);
            }
            else
            {
                lhm.put(i,1);
            }
        }

        int minCount = 1;
        char minChar = ' ';
        for(Map.Entry<Character,Integer> me: lhm.entrySet())
        {
            if(minCount > me.getValue())
            {
                minCount = me.getValue();
                minChar = me.getKey();

            }
        }
       
        System.out.println(minChar );
        
    }
    
}
