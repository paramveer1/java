public class Line2 {
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
            for(int j = 1;j<=i;j++){
                if(j<i){
                System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}