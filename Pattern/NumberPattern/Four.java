package NumberPattern;

public class Four {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            for(int j = 4;j>= i;j--){
                System.out.print(" ");
            }
            for(int j = i ;j<= i+i-1;j++){
                System.out.print(j);
            }
            for(int j = 2*(i-1);j>=i;j--){
            System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
