import java.util.Scanner;
public class ThrowDemo extends RuntimeException{
    ThrowDemo(String msg){
        super(msg);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int a = sc.nextInt();
        if(a<18){
            throw new ThrowDemo("you are not ell to vote");
        }
        else{
            System.out.println("You are elli to vote");
        }



    }
}
