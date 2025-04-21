package NumberPattern;

public class Six {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            for(int j = i;j<= 5;j++){
                if(i==1){
                    System.out.print(j);
                }
                else if(j==i){
                    System.out.print(j);
                }
                else if(j == 5){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
