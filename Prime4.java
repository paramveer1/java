import java .util . Scanner;
public class Prime4 {
    public static void main(String[] args) {
        char c ;
       
      do{

           System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int counter =0;
        for(int i = 1;i<=a;i++){
            if (a%i==0){
                counter++;
            }
        }
            if(counter==2){
                System.out.println(a + " is Prime numbr");
            }
        else{
            System.out.println(a + " is not Prime");
        }
        System.out.println("Do you want to Continue , If yes press y");
        c = sc.next().charAt(0);
    }while(c=='y' || c== 'Y');
        
    
    }
    
}

