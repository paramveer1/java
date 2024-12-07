import java.util.Scanner;
public class Armstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int no = n;
        int counter = 0;
        while(n>0){
            counter++;
           n= n/10;

        }
       

        int arm = 0;
        while(t>0){
            int r = t%10;
            int mul =1;
            for(int i =1;i<=counter;i++){
                mul = mul*r;

            }
            arm= arm+mul;
            t=t/10;

        }
        // System.out.println(arm);
        if(arm==no){
            System.out.println(no + " is Armstrong no");
        }
        else{
            System.out.println(no + " is not Armstrong");
        }
        // System.out.println(counter);

    }
    
}
