import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
// import java.util.Iterator;
import java.util.Iterator;

public class Iterato {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
    l.add(1);
    l.add(2);
    l.add("pa");
    l.add(50);
    
    ListIterator li = l.listIterator();
    li.add("deepa");
    li.add("shanu");
    li.add("param");
    Iterator itr= l.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
        System.out.println(l);
    }
    
    



    
}
