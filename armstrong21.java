import java.util.Scanner;

public class armstrong21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int digits = 0;
        while(temp>0){
            digits++;
           temp= temp/10;
        }
        // System.out.println(digits);
         temp = a;
         
         int arm = 0;
            while(temp>0){
                int r = temp%10;
                int mul = 1;
                for(int i = 1;i<=digits;i++){
                    

                   mul =  mul*r;
                }
                arm = arm+mul;
                temp=temp/10;
            }
            System.out.println(arm);
            if(arm==a){
                System.out.println(a + " is Armstrong");
            }
            else{
                System.out.println(a + " is not Armstrong");
            }
    }
    
}
