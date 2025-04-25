package StringPractice;
import java.util.HashMap;

public class OccurenceOfChar {
    public static void main(String[] args) {
        String s = "paramveer singh";
        char []c = s.toCharArray();
        HashMap <Character,Integer>hm = new HashMap();
        for(char i : c)
        {
            if(!hm.containsKey(i)){
                hm.put(i,1);

            }
            else{
               int value = hm.get(i);
                hm.put(i,value+1);
            }
        }
        System.out.println(hm);


        
    }
    
}
