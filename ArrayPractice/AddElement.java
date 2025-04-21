package ArrayPractice;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] a  = {5,8,9,7,78};
        int changeAt = 2;
        int element = 4;
        for(int i = a.length-1;i>changeAt;i-- ){
            a[i] = a[i-1];

        }
        a[changeAt] = element;
        System.out.println(Arrays.toString(a));
    }
    
}
