package Practice;

public class number {
    public static void main(String[] args) {
        for(int i = 1;i<= 5;i++){
            for(int j= 1;j<=i;j++ )
            {
                if(j==1||i==5||j==i)
                System.out.print(j);
                else{
                    System.out.print(" ");
                }            
            }
            System.out.println();
        }
    }
    
}
