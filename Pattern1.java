public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 1;i<= 4;i++){
            for(int j = 1;j<= i;j++){
                System.out.print(j);
            }
            for(int k = i-1;k>=1;k-- ){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
