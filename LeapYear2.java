import java .util.Scanner;
public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    System.out.println(y + " is Leap Year");
                }
                else{
                    System.out.println(y + " is not Leap Year");
                }
                
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
        System.out.println("not Leap Year");
        }
        
    }
    
}
