package String;

import java.util.Arrays;

public class TotalNoOfWord {
    public static void main(String[] args) {
        String s = "pa is a food allergy";
        String [] words =  s.split(" ");
        System.out.println(words.length);
        System.out.print(Arrays.toString(words));

    }
    
}
