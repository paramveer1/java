package Revision;
import java.util.Scanner;



public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        int digitNo = 0;


        while(temp>0){
            count++;
           temp =  temp/10 ;
            
        }
        // System.out.println(count);
       temp = number;
       int arm = 0;
       while(temp>0){
        int rem = temp%10;
        int mul = 1;
        for(int i = 1;i<= count;i++){
            mul = mul *rem;

        }
         arm = arm+mul;
         

         temp = temp/10;







       }
System.out.println(arm);

        



        
    }
    
}
