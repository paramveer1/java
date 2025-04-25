package StringPractice;

public class LongestWord {
    public static void main(String[] args) {
        String s = "paramveerrrrrr singh rajawat sabseBadaAdmiHai";
        String []words =  s.split(" ");
        String longestString  = "";

        for(String i : words)
        {
            if(i.length()>longestString.length())
            {
                longestString = i;
            }

        }
        System.out.println(longestString);
    }
    
}
