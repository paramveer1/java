import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class CollectionDemo1 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(4);
        System.out.println(l);


        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        
    }
}