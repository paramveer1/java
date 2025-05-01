package CollectionPractice;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector v =  new Vector<>();
        ArrayList al = new ArrayList();
        al.addFirst("pa");
        System.out.println(al);
        
        v.add("abhi");
        v.addFirst("afrin");
                v.addFirst("afrinaaaa");

        v.add("param");
         v.add("parveeram");
        System.out.print(v);
    }
    
}
