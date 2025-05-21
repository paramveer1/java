public class EquilateralT {
    public static void main(String[] args) {
        
        for(int i = 1;i<=5;i++)
        {
            for(int j = 1;j<=9;j++)
            {
                if(i+j==6)
                {
                    System.out.print("*");
                }
                // else
                // {
                //     System.out.print(" ");
                // }
                else if(j-i==4)
                {
                    System.out.print("*");
                }
                else if(i==5)
                {
                    if(j%2!=0)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }

               
            }
            System.out.println();
        }
    }
    
}
