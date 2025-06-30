import java.util.ArrayList;
import java.util.Iterator;
public class IteratorCursor {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(0);
        al.add(1,8);
        al.add(2,99);
        for(int i =1;i<=5;i++)
        {
            al.add(i);
        }

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
           Integer i =  (Integer)itr.next();
            if(i%2!=0)
            {
                itr.remove();
            }
         
        }
        System.out.println(al);

    }
    
}
