import java . util . Scanner;
public class Armstrong5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int tem = no;
        int count = 0;
        while(tem>0){
            count++;
            tem=tem/10;
        }
        tem=no;
        int arm = 0;
        while(tem>0){
            int r = tem%10;
            int mul = 1;
            for(int i = 1;i<= count;i++){
                mul = mul*r;
            }
            arm = arm + mul;
            tem = tem /10;
        }
        if(arm==no){
            System.out.println(no + " is Armstrong");
        }
        else{
            System.out.println(no + " is not armstrong");
        }
       
       
       
         
      
        sc.close();
    }
    
   
}
