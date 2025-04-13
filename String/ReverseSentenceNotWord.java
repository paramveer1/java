package String;

public class ReverseSentenceNotWord {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        String []words= s.split(" ");
        for(int i = words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
    
}
