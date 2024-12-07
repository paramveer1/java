import java . util.Scanner;
public class armstrong7 {
    public static void main(String[] args) {
        char c ;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int temp = a;
        int counter = 0;
        while( temp>0){
            temp=temp/10;
            counter++;

        }
        // System.out.println(counter);

        temp =  a;
        int arm = 0;
        while (temp>0) {
            
            int rem = temp%10;
            temp = temp/10;
            int mul =1;
            for(int i = 1 ; i<= counter;i++){
                mul = mul*rem;

            }
            arm = arm + mul;

            
            
        }
        if(a==arm){
            System.out.println("Armstriong");
        }
        else {
            System.out.println("Not Armstrong");
        }
        System.out.println("Do You want to continue? If Yes press 'y'");
        c=sc.next().charAt(0);
      }while(c=='y'|| c=='Y') ;
        
    }
    
}
