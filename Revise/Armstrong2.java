package Revise;
import java.util.Scanner;


public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int count = 0;
        int arm = 0;
        while(temp>0)
        {
            count++;
            temp = temp/10;
        }

        temp = a;
        while(temp>0)
        {
            int rem = temp%10;
            int mul = 1;
            for(int i = 1;i<= count;i++)
            {
                mul = mul * rem;
            }

            arm = arm + mul;
            temp = temp /10;
        }

        if(a==arm)
        {
            System.out.println("arm num");
        }
        else
        {
            System.out.println("not arm");
        }

    }
}
