public class Coding {
    public static void main(String[] args) {
        for(int i = 1;i<= 4;i++){
            for(int j = 1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print(1);
                }
                else{
                    System.out.print(i-1);
                }
            }
            System.out.println();
        }
    }
    
}
