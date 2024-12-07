import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;

public class Enumeratio {
    public static void main(String[] args) {
       
    ArrayList al = new ArrayList();
    al.add(5);
    al.add(54);
    al.add(66);
    System.out.println(al);
    
    System.out.println(al.set(1,999));
    System.out.println(al);
}
}