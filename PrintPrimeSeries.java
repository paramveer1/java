import java . util . Scanner;
public class PrintPrimeSeries {
    public static void main(String[] args) {
        char c ;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  " );
        int a = sc.nextInt();
        System.out.println();
        for(int i = 1 ;i<= a;i++){
            int counter = 0;
            for(int j = 1;j<=i;j++){

                if(i%j==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
        System.out.println("Do you want to continue? If Yes press Y");
        c = sc.next().charAt(0);
    }while(c=='y' || c == 'Y');

    }
    
}
