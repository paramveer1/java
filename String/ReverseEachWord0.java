package String;

public class ReverseEachWord0 {
    public static void main(String[] args) {
        String s = "paramveer Singh Rajawat";
        String[] words = s.split(" ");
        for(int i =0;i<words.length;i++ ){
            for(int j = words[i].length()-1;j>=0;j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }



        
    }

    
}
