public class PatternAdvance {
    public static void main(String[] args) {
        for(int i = 1 ; i<=4;i++){
            for(int j = 1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("1");
                }
                else{
                    System.out.print(i-1);
                }
            }
            System.out.println();
        }
    }
    
}
