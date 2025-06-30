import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        Vector v = new Vector<>();
       Enumeration e = v.elements();
       for(int i = 1;i<=10;i++)
       {
        v.addElement(i);
       }

       while(e.hasMoreElements())
       {
        Integer o = (Integer)e.nextElement();
        if(o%2==0)
        {
System.out.println(o);
        }
        
       }
      
      

    }
    
}
