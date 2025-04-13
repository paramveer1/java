import java .util.Scanner;
public class Armstrong12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t1 = a;
        int count = 0;

        while(t1>0){
            count++;
            t1= t1/10;

        }



        int t2 = a;
        int arm = 0;
        while(t2>0){
            int mul = 1;
            int rem = t2%10;
            for(int i = 1;i<= count;i++){
                mul = mul* rem;
            }
             arm = arm + mul;



            t2=t2/10;
        }
        if(a == arm){
            System.out.println("arm");
        }
        else{
            System.out.println("nit arm");
        }
    }
    
}
