package StringPractice;

public class Rev {
    public static void main(String[] args) {
        String s = "paramveer is a good boy";
        String rev = "";
        for(int i = 0;i<= s.length()-1;i++){
                rev = s.charAt(i)+rev;
        }
        System.out.println(rev);
    }
    
}
