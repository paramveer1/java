import java.util.*;
// import java.util.LinkedHashSet;
public class DuplicateElementsRemovalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        LinkedHashSet lhs = new LinkedHashSet<>();
        for(int i = 0; i< s.length();i++){
            lhs.add(s.charAt(i));

        }

       System.out.println(lhs);

       for(Object i : lhs){
        System.out.print(i);
       }
       
           
         
      
       


        

        
        
    }
    
}
