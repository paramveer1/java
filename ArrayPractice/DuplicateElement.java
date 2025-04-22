package ArrayPractice;
public class DuplicateElement {
    public static void main(String[] args) {
        int [] a={1,35,6,655,4,5446,7,45,36,4,3,2,57,78,99,47,7,7,7,7,8};
        for(int i = 0;i<= a.length-1;i++ ){
            for(int j = i+1;j<=a.length-1;j++ ){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                    
                }
            }
        }

        
    }
    
}
