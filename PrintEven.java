import java . util .Scanner;
public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int i =1;i<= a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        }
    
}
