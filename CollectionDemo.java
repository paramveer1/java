import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(5);
        System.out.println(a);
         
        ArrayList b = new ArrayList<>();
        b.add(9);

         a.addAll(b);
         System.out.println(a);
         System.out.println(a.add("aaa"));
         System.out.println(a);
        System.out.println(a.contains(5)); 
        a.clear();
        


        
    }
}


    
