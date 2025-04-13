import java.util.Scanner;
public class Armstronggg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp>0){
            count++;
            temp= temp/10;

        }

        temp = n;
        int arm = 0;
        while(temp>0){
            int r = temp%10;
            int mul = 1;
            for(int i = 1;i<= count;i++){
                mul = mul *r;
            }
            arm = arm + mul;
            temp = temp/10;
        }

        if(arm == n){
        System.out.println(n + " is armstrong");
        }
        else{
            System.out.println(n + 
            " is not armstrong");
        }
    }
    
}
