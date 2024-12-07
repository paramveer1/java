import java.util.Scanner;
public class Factorial1 {
    
    public static void main(String[] args) {
        char c;
        do{      System.out.println("Enter Number");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int f = 1;
            for(int i = a;i>=1;i--){
                f = f*i;
            }
           System.out.println(f);
           System.out.println("Do you want to continue? If yes press 'y'");
            c = sc.next().charAt(0);
        }while(c=='y' || c=='Y');
}


    
}
