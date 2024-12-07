import java.util.Scanner;
public class Prime1 {
    public static void main(String [] args){
        int counter =  0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<= a;i++){
            if(a%i==0){
                counter++;


            }
        }
            if(counter==2){
                System.out.println(a + " is Prime");
            }
            else{
                System.out.println(a +  " is not Prime");
            }
        }
    }

    

