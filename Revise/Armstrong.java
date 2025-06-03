package Revise;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int temp =a;
        int count = 0;
        while(temp>0)
        {
            temp = temp/10;
            count++;

            
        }

        int arm = 0;
        temp = a;
        while(temp>0)
        {
            int r = temp%10;
            int mul = 1;
            for(int i = 1;i<= count;i++)
            {
                mul = mul * r;
            }

            arm = arm +mul;
            temp = temp/10;
        }
        if(a==arm)
        {
            System.out.println(" no is arm");
        }
        else{
            System.out.println("not arm");
        }
        
    }
    
}
