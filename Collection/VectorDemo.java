package Collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo{
    public static void main(String[] args) {
        Vector v = new Vector<>();
        ArrayList al = new ArrayList<>();
        al.add(5);
        al.add(5);

        al.add("param");

        al.add(5665);

        al.add(5465);


        System.out.println(al);


        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();

        }
        System.out.println(al);
        
    //     v.add(6);
    //     v.add(85);
    //     v.add("param");
    //     v.add("ok");
    //     System.out.println(v);
    //     Enumeration e = v.elements();
    //     while(e.hasMoreElements()){
    //         System.out.println(e.nextElement());
    //     }
    }
}