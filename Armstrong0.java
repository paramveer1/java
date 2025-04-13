import java.util.Scanner;
public class Armstrong0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp  = a;
        int count = 0;

        while(temp>0){
            count++;
            temp = temp/10;
        }
        temp = a;
        int arm = 0;
       while(temp>0){
        int r = temp%10;
        int mul = 1;
        for(int i = 1;i<=count;i++){
            mul = mul *r;



        }
        arm = arm +mul;

        temp= temp/10;


       }

       if(arm==a){
        System.out.println("Armstrong");
       }
       else{
        System.out.println("not Armstrong");
       }
        
    }
    
}
