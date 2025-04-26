package StringPractice;
import java .util.HashMap;
import java.util.Map;


public class Demo 
{
    public static void main(String[] args)
     {
        String s = "paramveer singh rajawat";
        char c[] = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap();

        for(char i:c)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }

        }
        System.out.println(hm);
        int maxCount = 0;
        char maxChar = ' ';

        for(Map.Entry<Character,Integer> me : hm.entrySet())
        {
                if(maxCount < me.getValue())
                {
                    maxCount = me.getValue();
                    maxChar = me.getKey();
                }
        }
        System.out.println(maxChar +" "+ maxCount);
     }    






    
}
