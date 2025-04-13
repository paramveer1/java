public class NumberPatternYt {
    public static void main(String[] args) {
        int k = 6;
        for(int i = 1;i<= 6;i++){

           
            for(int j = 1;j<=i;j++){
                System.out.print(k);
                k++;


            }
            k=6;
            k = k-i;
            System.out.println();
        }
    }
    
}
