import java.util.Scanner;
public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int A = a;
        int counter=0;

        while(A>0){
            A=A/10;
            counter++;


        }
        // System.out.println(counter);
        


        int no =a;
        int arm = 0;
        
    while(no>0){
        int mul = 1;
      int rem = no%10;
             



        for(int i = 1;i<=counter;i++){
            mul = mul * rem;
        }
        // System.out.println(mul+"mul");

       
        arm =arm+mul;
        no=no/10;
        // System.out.println(arm + " ppppp");
    }
    // System.out.println(arm + " p");

    if(arm==a){
        System.out.println(a +" is Armstrong");
    }
    else{
        System.out.println(a +" is not Armstrong");
    }

    }
    

    
}
