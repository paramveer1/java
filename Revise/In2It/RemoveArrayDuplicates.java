package Revise.In2It;
import java.util.HashSet;


public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        int a [] = { 1,2,3,4,5,88,24,2,5,3,4,8,8,7};
        HashSet hs = new HashSet();
        for(int i : a)
        {
            hs.add(i);
        }
        System.out.print(hs + " ");
        for(Object i : hs)
        {
            System.out.print( i + " ");
        }
    }
    
}
