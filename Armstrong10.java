import java .util . Scanner;
public class Armstrong10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp>0){
            count++;
            temp= temp/10;
        }

        temp = num;
        int arm = 0;
        while (temp > 0) {
            int rem = temp%10;
            int mul = 1;
            for(int i = 1 ; i<= count;i++){
                mul = mul * rem;
            }
            arm = arm + mul;
            temp = temp /10;


            
        }

        if(arm==num){
            System.out.println(num + " armstrong");
        }
        else 
        System.out.println("not armstrong");
    }
    
    
}
