import java . util.Scanner;
public class fibonacci
 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
            int a = 0;
            int  b = 1;
            System.out.print(a + " " +b);
            
             for (int i = 1;i<= f;i++)
             {
                int c = a+b;
                System.out.print(" "+ c );
                a=b;
                b=c;
             }
    }
    
}
