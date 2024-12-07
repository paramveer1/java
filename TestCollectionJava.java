import java.util.*;
public class TestCollectionJava {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add("param");
        System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
