import java .util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateElementRemovalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashSet hs = new LinkedHashSet<>();
        for(int i = 0;i< s.length();i++){
            hs.add(s.charAt(i));
        }


        System.out.println(hs);

        for(Object o : hs){
            System.out.print( o);
        }
        
    }
    
}
