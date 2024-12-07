import java.util.Scanner;
public class Calc {
    public static void main(String [] args)
    {   

       String t; 
        do{
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
         int b = sc.nextInt();
        System.out.println("Enter +,-,*,/");
        String s = sc.next();
      
        switch(s){
                case "+" : System.out.println(a+b);
                break;
                case "-" :  System.out.println(a-b);
                break;
                case "/":  System.out.println(a/b);
                break;
                case "*":  System.out.println(a*b);
                break;

        }
        System.out.println("Want to Continue? type  Y for yes and N for No");
       t=sc.next();
    } while(t.equals("y")||t.equals("Y"));
    }
    
}
