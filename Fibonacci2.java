public class Fibonacci2 {
    
    public static void main(String[] args) {
        int n = 100;
    int a = 0;
    int b = 1;
    System.out.print(0+" "+1+" ");
    int i=1;
       while ( i<=10) {
        
       
             int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
       }
        }
    }
       
    
