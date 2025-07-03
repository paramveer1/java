package DSA;
import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int no =  sc.nextInt();

       int arm = 0;
       int temp = no;
       int count = 0;
       while(temp>0)
       {
        count++;
        temp = temp/10;
       }

       temp = no;
       while(temp>0)
       {
        int rem = temp % 10 ;
        int mul = 1;
        for(int i = 1;i<= count;i++)
        {
            mul = mul*rem;
        }

        arm = arm + mul;
        temp = temp/10;

       }
       if( arm == no){
        System.out.println("armstrong");
       }
        else
        {
            System.out.println("not arm");
        }
    }
    
}
