import java . util. Scanner;
public class Armstrong6 {
    public static void main(String[] args) {
      char input ;
      do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number\n");
        int a = sc.nextInt();
       
        int temp = a;
        int temp2 = a;
        int counter = 0;

        while( temp>0){
            counter++;
           temp=  temp/10;

             

        }
        // System.out.println(counter);
      
        int arm = 0;
      while(temp2>0){
        int  mul;
        int rem = temp2%10;
         mul = 1;


       for(int i = 1;i<=counter;i++){
        mul=rem*mul;
       }
        arm =arm + mul;

                 temp2= temp2/10;                                                                      
      }
      // System.out.println();
      System.out.println(arm);
      if(arm==a)
      System.out.println("No is Armstrong");
      else
      System.out.println("No is not Armstrong");
      
      System.out.println("Do You Want to Continue? If Yes press Y");
        input = sc.next().charAt(0);

    }while(input=='y'|| input == 'Y');
    System.out.println("Thanks");
    }
    
}
