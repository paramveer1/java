public class VerticalSnake0 {
    public static void main(String[] args) {
        int k = 10;
        int l = 11;
        for(int i = 1;i<= 5 ; i++){
            for(int j = 1;j<= 5;j++){
                if(j==1){
                    System.out.print(i+" ");
                }
                else if(j%2==0){
                    System.out.print(k+" ");
                    k=k+10;


                }
                else{
                    System.out.print(l+" ");
                    l=l+10;
                }

            }
            System.out.println();
            k =10;
            l=11;
            k=k-i;
            l=l+i;
        }
    }
    
}
