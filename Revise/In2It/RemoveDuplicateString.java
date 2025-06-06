package Revise.In2It;
import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "paramveer";
        Set set = new LinkedHashSet<>();

        char a[] = s.toCharArray();
        for(char i : a)
        {
            set.add(i);
        }
String snew = "";
        for(Object i : set){
            snew = snew + i;

        }
        System.out.print(snew);

    }
    
}
