import java.util.Scanner;
public class Armstrong4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  s = "";
        do{ int no = sc.nextInt();
        int a = no;
        int digit = 0;
        int arm = 0;
       
        
        while (a>0) {

            digit++;
            a= a/10;
        }
        a=no;
        while(a>0){
            int r = a%10;
            int mul = 1;
            for(int i = 1;i<=digit;i++){
                mul = mul*r;
               
            }
           
            arm = arm+mul;
            a=a/10;
        }
        if(arm==no){
            System.out.println(no + " is Armstrong");
        }
        else {
            System.out.println(no + " is not Armstrong");
        }
        System.out.println("Do you want to Continue");
        s=sc.next();
    }while((s.equals("Y")||s.equals("y")));
    }
    
}
