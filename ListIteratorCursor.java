import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorCursor 
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        for(int i = 1;i<= 20;i++)
        {
            al.add(i);
        }
        ListIterator litr = al.listIterator();
        while(litr.hasNext())
        {
            Integer i = (Integer)litr.next();
            if(i%2!=0)
            {
                litr.remove();
            }
           
        }
         System.out.println(al);
         litr.remove();
         System.out.println(al);
        //  litr.hasPrevious();
         System.out.println(litr.previous());
          System.out.println(litr.previous());
          litr.set(666);
           System.out.println(al);
           litr.add(6);
            System.out.println(al);
    }
}