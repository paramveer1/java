package Revise.In2It;
import java.util.*;

public class DuplicateArraySet {
    public static void main(String[] args) {
        int i [] = {1,2,3,2,3,5,4};
        Set set = new HashSet();
        for(int j : i)
        {
            if(set.add(j)==false)
            {
                System.out.print(j+" ");
            }
        }
    }
    
}
