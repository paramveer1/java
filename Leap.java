import java . util . Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4==0)
        {
            if(a%100==0){
                if(a%400==0)
                {
                    System.out.println(a + " is a Leap Year");
                }
                else
                {
                    System.out.println(a + " is not a Leap Year");
                }


            }
            else{
                System.out.println(a + " is a Leap year");
            }
        }
        else{
            System.out.println(a + " is not a Leap Year");
        }
        sc.close();
    }
}
