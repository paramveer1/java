package NumberPattern.Pattern2;

public class Z {
    public static void main(String[] args) {
        for(int i = 1;i<= 5;i++){
            for(int j = 1;j<= 5;j++){
                if(i== 1|| i==5||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
    
}
