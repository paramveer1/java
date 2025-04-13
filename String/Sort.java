package String;

// import java.util.ArrayList;
// import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String s = "paramveersinghrajawat";
        ArrayList al = new ArrayList<>();
        for(int i = 1;i<s.length();i++){
            al.add(s.charAt(i));
        }
        Collections.sort(al);
       System.out.println(al); 
    }
    
}
