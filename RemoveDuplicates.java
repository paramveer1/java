import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "paramveer";
        char []c = s.toCharArray();
        Set set= new HashSet();

        for(char st : c)
        {
            set.add(st);
        }

        System.out.println(set);
        String su = ""; 
        for(Object cc : set)
        {
            su = su+cc;
        }
        System.out.println(su);
    }

    
}
