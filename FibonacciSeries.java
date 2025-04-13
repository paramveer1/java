public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        
        for(int i = 1 ; i<9;i++){
            int c = a+b;
            System.out.println(a+b);
            a=b;
            b=c;

        }

    }
    
}
