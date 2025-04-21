package NumberPattern.Pattern2;

public class Two {
    public static void main(String[] args) {
        for(int i = 1;i<= 5;i++){
            for(int j = 1;j<= i;j++ ){
                System.out.print(j);
            }

            for(int j = i;j> 1;j--){
                System.out.print(j-1);
            }
            System.out.println();
        }
    }
    
}
