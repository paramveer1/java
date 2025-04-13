import java.util.Arrays;

public class InsertArrayElement {
    public static void main(String[] args) {
        int []a =   {10,20,30,40,50};
        for(int i = a.length-1;i>2;i--){
            a[i]= a[i-1];

        }
        a[2]= 100;
        // for(int i : a){
        //     System.out.println(i);
        // }

        String s = Arrays.toString(a);
        System.out.println(s);
        
    }
    
}
