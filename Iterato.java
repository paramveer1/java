import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
// import java.util.Iterator;
import java.util.Iterator;

public class Iterato {
    public static void main(String[] args) {
        List l = new ArrayList();
    l.add(1);
    l.add(2);
    l.add("pa");
    
    ListIterator li = l.listIterator();
    li.add("deepa");
    li.add("shanu");
    Iterator itr= l.iterator();
    
    itr.next();
    itr.remove();
    
    // li.remove();
    
    
   
    // itr.next();
    // itr.remove();
    // li.add("para");
    // li.add("param");

    

   
    System.out.println(l);
   
    
        
    }
    
    



    
}
