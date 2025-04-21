package Array;

public class MinElement {
    public static void main(String[] args) {
        int [] a = { 55,4334,54,4,100,253,4,555};
        int min = a[0];
        for(int i = 1 ; i< a.length;i++){
            if(a[i]<min){
                min = a[i];
            }

        }
        System.out.println(min);
    }
    
}
