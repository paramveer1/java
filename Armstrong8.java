import java.util.Scanner;
public class Armstrong8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = no;
        int count =0;


        while (temp>0) {
            count++;
            temp = temp/10;
            
        }
         temp=no;
         int arm = 0;
        while(temp>0){
         int rem = temp%10;
         int mul = 1;
         for(int i = 1;i<=count;i++){
            mul = mul * rem;

         }
         arm = arm +mul;







            temp = temp/10;
        }
        if(arm==no){
            System.out.println(no + " is Armstrong");
        }
        else{
            System.out.println(no + " is not armstrong");
        }
    
    }
    
}
