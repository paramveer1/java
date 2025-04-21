package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int flag =0;
        int []a = {1,4,34,66,44,87,55,444,66655} ;
        for(int i = 0;i<a.length-1;i++ ){
            for(int j = 0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                  int temp =   a[j] ;
                  a[j] = a[j+1];
                  a[j+1] = temp;
                  flag = 1;
                }
            }
             if(flag==0){
                break;
             }
        }

        // for(int i = 0;i<a.length;i++){
        //     System.out.print(a[i]+" ");

        // }
        System.out.println(Arrays.toString(a));
        
    }
    
}
