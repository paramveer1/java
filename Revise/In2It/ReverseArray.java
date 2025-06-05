package Revise.In2It;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        int a [] =  {1,2,3,4,5,6,7,8,9,10};
        int temp;
        for(int i = 0;i<=(a.length-1)/2;i++)
        {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    
    
}
