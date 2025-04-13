import java .util.Scanner; 
public class Pallindrome5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int rev = 0;
          
         while ((a>0)) {
            
         
        int rem = a%10;
        rev = rev *10+rem;
        a=a/10;
       
         }
         if(temp==rev){
            System.out.println("no is Pallindrome");
         }
         else
         {
            System.out.println("no is not Pallindrome");
         }
        
    }
      
    
}
