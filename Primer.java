import java.util.Scanner;
public class Primer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
       
        for(int j = 1;j<= 100;j++){
            int count=0;
        for(int i = 1;i<= j;i++ ){
            if(j%i==0){
                count++;
                
            }

        }
        if(count==2){
            System.out.println(j);
        }
    }
}
    
}
