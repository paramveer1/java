import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println(n + " leap year");
                }
                else{
                    System.out.println(n + " not leap year");
                }
                
            }


            else{
                System.out.println(n + " Leap year");
            }


        }



            else{
                System.out.println(n + " not Leeap year");
            }



        }
    }
    

