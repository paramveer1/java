package Practice;
import java.util.Scanner;

public class Armstriong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int counter = 0;
        while(temp>0)
        {
            counter++;
            temp=temp/10;
        }


        int arm = 0;
       
        temp = a;
         
        while(temp>0)
        {
            int rem = temp %10;
             int mul = 1;
           
            for(int i = 1; i<= counter;i++)
            {
                mul = mul *rem;
            }
            arm = arm + mul;
            temp = temp/10;
        }

        if(arm == a)
        {
            System.out.println("no is armstrong");
        }
        else{
            System.out.print("not arm");
        }


    }

    
}
