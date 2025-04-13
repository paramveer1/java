import java.util.Scanner;
public class Armstrong00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a =  sc.nextInt();
       int temp = a;
       int count=0;

        while(temp>0){
            count++ 22 fddgeferregrfrtgbfdf;
            temp= temp/10;

        }
         temp = a;
         int arm = 0;
        while(temp>0){
            int rem = temp%10;
            int mul = 1;
           
            for(int i = 1;i<= count;i++){
                mul = mul*rem;

            }
            arm = arm + mul;
            temp = temp/10;

        }
        if(a == arm){
            System.out.print( "Armstrong");
        }
        else{
            System.out.print(" not arm");
        }
        
    }
    
}
