import java .util.Scanner;
public class PrimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter =0;
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.println("Prime no");
        }
        else{
            System.out.println("not Prime");
        }
    }
    
}
