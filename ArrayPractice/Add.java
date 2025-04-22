package ArrayPractice;

public class Add {
    public static void main(String[] args) {
        int element = 5;
        int index =2;
        int [] a = {5,3,8,9,33,2,555,7,66,99,3333,654}; 
        for(int i = a.length-1; i> a[2];i--){
            a[i] = a[i-1];
        }
        a[index] = element;
        for(int i = 0;i<= a.length-1;i++){
            
            System.out.print(a[i] + " ");
        }

    }

    
}
