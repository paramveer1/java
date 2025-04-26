package StringPractice;

public class ReverseOrderofWord {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        String [] words = s.split(" ");
        String rev = "";
        for(int i = words.length-1;i>=0;i--)
        {
            rev = rev + words[i]+" ";
            
        }
        System.out.println(rev);
    }
    
}
