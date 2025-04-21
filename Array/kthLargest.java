package Array;

import java.util.Arrays;

public class kthLargest {
    public static void main(String[] args) {
        int [] a = {33,45567,44,33,2,22,2,4,5,6,7,7,8,8877777,4};
        for(int i = 0;i<= a.length-1;i++){
            for(int j =i+1;j<= a.length-1;j++){
                if(a[i]<a[j]){
                   int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;

                }

            }
        }
        System.out.println(a[05
        ]);
    }
    
}
