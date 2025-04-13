import java.util.HashSet;
import java.util.Set;
public class Duplicate2 {
    public static void main(String[] args) {
        int arr[] = {5,3,6,3,5,5,5,8,8,3,4,6,8,0,0};
        Set s = new HashSet();


        for(int a:arr){
           if( s.add(a)==false){
            System.out.println(a);
           }
        }

    }
    
}
