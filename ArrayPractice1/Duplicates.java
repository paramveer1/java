import java.util.HashSet;
public class Duplicates {
    public static void main(String[] args) {
        int a []  = {1,4,7,5,7,9,89,00,0,6,9,7,3,6,5,4};
        HashSet hs = new HashSet();

        for(int i : a)
        {
          if(! hs.add(i)) {
            System.out.print(i+ " ");
          }
        }
    }
    
}
