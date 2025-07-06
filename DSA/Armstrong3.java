package DSA;

import java.util.Scanner;
public class Armstrong3 {
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int arm = 0;
        int count = 0;
        while(temp>0)
        {
            temp = temp /10;
            count++;
        }
        temp = num;
        while(temp>0)
        {
              

            int mul = 1;
            int rem = temp%10;
            temp = temp /10;
            for(int i = 1 ; i<= count;i++)
            {
                mul = mul*rem;
            }

            arm = arm+mul;
          
        }
        if(arm==num)
        {
            System.out.println("no is arm");
        }
        else{
            System.out.println("not arm");
        }
        
    }
}
