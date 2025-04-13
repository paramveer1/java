import java .util. Scanner;
public  class FibonacciDemo{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Series number");
        int no = sc.nextInt();

        System.out.print(a+" "+b +" ");
        for(int i = 1; i<=no-2;i++){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }
}