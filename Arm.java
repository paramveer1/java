import java.util.Scanner;
public class Arm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t1 = a;
        int length=0;
        while(t1>0){
            // System.out.println(length);
            length++;
            t1=t1/10;

        }
        int t2= a;
        int arm =0;
        while(t2>0){
            int rem = t2%10;
            int mul =1;
            for(int i = 1;i<=length;i++){
                mul = mul *rem;

            }
            arm = arm+mul;
          t2=t2/10;


        }
        if(arm==a){
            System.out.println(a + " is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
       


    }
}
