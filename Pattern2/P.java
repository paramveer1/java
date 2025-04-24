package Pattern2;

public class P {
    public static void main(String[] args) {
        for(int i = 65;i<= 66;i++)
        {
            for(int j = 65;j<=i;j++)
            {
                if(i==65&&j==65){
                    System.out.print(" ");
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
