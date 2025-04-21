package Array;

public class MaxElement {
    public static void main(String[] args) {
        int [] a = {4,3,6,77,88,5,3335,6353,34334};
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
               max=a[i];
            }
        }
        System.out.println(max);


        
    }
    
}
