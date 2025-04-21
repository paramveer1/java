package Revision;
import java.util.Scanner;


public class Armstrong0 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int number = sc.nextInt();


        int temp = number;
        int counter = 0;

        while(temp>0){
          
            temp= temp /10;
            counter++;
        }
        // System.out.println(counter);

         int arm = 0;
         
         temp = number;
        while(temp>0){
            int r = temp%10;
            int mul= 1;
            for(int i = 1;i<= counter;i++){
                mul = mul*r;

            }

            arm = arm + mul;
        temp = temp / 10 ;}

        if(number == arm){
            System.out.println(number + " is armstrong");
        }
        else{
            System.out.println("not arm");
        }
        
    }
    
}
