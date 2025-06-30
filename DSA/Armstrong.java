package DSA;
import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
       int number =  sc.nextInt();

       int number_copy = number;
       int count = 0;
       int arm = 0;

       while(number_copy>0)
       {
        count++;
       number_copy= number_copy /10;
       }
    number_copy = number;
       while(number_copy>0)
       {
        int rem = number_copy%10;
        int mul = 1;
        for(int i = 1;i<= count;i++)
        {
            mul = mul *rem;
           
        }
        arm = arm + mul; 
        number_copy = number_copy/10;

       }
       if(arm==number)
       {
        System.out.println(number + " is Armstrong");
       }
       else{
        System.out.println(number + " is not armstrong");
       }

        
    }
    
}
