import java.util.Scanner;
public class PallindromeNo {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        char input;
        
        
        do{
            System.out.println("Enter number");
            int a = sc.nextInt();
          
            int temp =a;
            int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;

        }


            if(rev==a){
                System.out.println(a + " is Pallindrome");
            } 
            else{
                System.out.println(a + " is not pallindrome");
            }  
            System.out.println("Do You want to continue");
            input = sc.next().charAt(0);
        }while(input=='y'|| input=='Y');
        
    }
   
    
}
