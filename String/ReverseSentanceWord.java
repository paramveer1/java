package String;

public class ReverseSentanceWord
 {
    public static void main(String[] args) {
        String s = "Namste India";
        String [] words = s.split(" ");
        for(int i = words.length-1; i>=0;i--){
            System.out.print( words[i] + " ");
            // System.out.print();
        }


    }
    
}
