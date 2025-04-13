package String;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        String[] words =   s.split(" ");
        // System.out.println(words);
      
        for(int i =words.length -1;i>=0;i--){
            for(int j = words[i].length()-1;j>=0;j--){
                System.out.print(words[i].charAt(j));


            }
            System.out.print("   ");
        }

        
       
    
  

    
}
}
