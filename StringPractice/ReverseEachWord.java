package StringPractice;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
       String [] words = s.split(" ");
       String rev = "";

        for(String word  : words){
            for(int i = word.length()-1;i>=0;i--)
            {
                rev = rev + word.charAt(i);
            }
            rev = rev + " ";
            

        }
        System.out.println(rev);
    }
    
}
