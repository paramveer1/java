package Practice;

public class Fibonacciseries {
    public static void main(String[] args) {
        int a= 0;

        int b = 1;
        System.out.print(a+" "+b);
        for(int i = 1;i <= 10;i++)
        {
            int c = a+b;
           
            a=b;
            b=c;
             System.out.print(" "+c);
        }
    }


    
}
